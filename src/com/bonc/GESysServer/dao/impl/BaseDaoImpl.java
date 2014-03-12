package com.bonc.GESysServer.dao.impl;



import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;


//import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//import org.springframework.util.ReflectionUtils;


import com.bonc.GESysServer.dao.BaseDao;



	/**
	 * 实现baseDao接口的所有方法<br>
	 * 基于Spring hibernate3的通用DAO，并支持源生SQL查询模板
	 * 
	 * @author 项征<br>
	 * @date 2013-09-06<br>
	 */
@Repository
public class BaseDaoImpl<T, ID extends Serializable> implements BaseDao<T,ID>{
	protected static Logger logger =  Logger.getLogger(BaseDao.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	protected Class<T> entityClass;
	protected String className;

	/**
	 * 通过范型反射，取得在子类中定义的entityClass.
	 */
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type genType = getClass().getGenericSuperclass();
		if (!(genType instanceof ParameterizedType)) {
			this.entityClass = (Class<T>) Object.class;
			className = getClass().getSimpleName();
		} else {
			this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			className = entityClass.getSimpleName();
		}
	}
	
	/**
	 * 通过SessionFactory获得当前的session
	 * */
//	protected Session getSession() {
//		Session session = sessionFactory.getCurrentSession();
//		return session;
//	}
	
	@Override
	public T create(T entity) {
//		getSession().persist(entity);
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(ID id) throws Exception {
//		return (T) getSession().get(entityClass, id);
		return null;
	}
	
	@Override
	public T save(T entity) throws Exception {
//		getSession().save(entity);
		return entity;
	}
	
	@Override
	public T update(T entity) {
//		getSession().update(entity);
		return entity;
	}
	
	@Override
	public T saveOrUpdate(T entity) {
//		getSession().saveOrUpdate(entity);
		return entity;
	}
	
	@Override
	public void delete(T entity) throws Exception {
//		getSession().delete(entity);			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T load(ID id) throws Exception {
//		return (T) getSession().load(entityClass, id);
		return null;
	}
	
	@Override
	public void remove(T entity) {
//		getSession().delete(entity);
	}
	
	@Override
	public  void removeById(ID id) throws Exception {
//		getSession().delete(get(id));
	}
	
	@Override
	public List<T> querySQLObjectList(String sql,Object... values) {
		Connection connection = null;
		DataSource ds = jdbcTemplate.getDataSource();
		PreparedStatement pt = null;
		ResultSet rs = null;
		List<T> list = new LinkedList<T>();
		try {
			connection = ds.getConnection();
			pt = connection.prepareStatement(sql);
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					pt.setObject(i + 1, values[i]);
				}
			}
			rs = pt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCount = rsmd.getColumnCount();
			Field[] fields = entityClass.getDeclaredFields();
	
			while (rs.next()) {// 对每一条记录进行操作
				T obj = (T) entityClass.newInstance();// 构造业务对象实体
				// 将每一个字段取出进行赋值
				for (int i = 1; i <= colCount; i++) {
					Object value = rs.getObject(i);
					// 寻找该列对应的对象属性
					for (int j = 0; j < fields.length; j++) {
						Field f = fields[j];
						// 如果匹配进行赋值
						if (f.getName().equalsIgnoreCase(rsmd.getColumnLabel(i))) {
							boolean flag = f.isAccessible();
							f.setAccessible(true);
							f.set(obj, value);
							f.setAccessible(flag);
						}
					}
				}
				list.add(obj);
			}
			rs.close();
			pt.close();
			connection.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			if (rs != null)
				try {
					rs.close();
					pt.close();
					connection.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			return null;
		} finally {
			try {
				rs.close();
				pt.close();
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
//	@Override
//	public Query createQuery(String hql, Object... values) {
//		Query query = getSession().createQuery(hql);
//		for (int i = 0; i < values.length; i++) {
//			query.setParameter(i, values[i]);
//		}
//		return query;
//	}
	
//	@Override
//	public SQLQuery createSQLQuery(String sql, Object... values) {
//		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
//		for (int i = 0; i < values.length; i++) {
//			sqlQuery.setParameter(i, values[i]);
//		}
//		return sqlQuery;
//	}
//	@SuppressWarnings (value={"unchecked"})
//	public List<T> createSQLQuery(Class<T> entityClass, String sql, Object... values) {
//		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
//		for (int i = 0; i < values.length; i++) {
//			sqlQuery.setParameter(i, values[i]);
//		}
//		return sqlQuery.addEntity(entityClass).list();
//	}
	
//	@Override
//	public Criteria createCriteria(Class<T> entityClass, Criterion... criterions){
//		Criteria criteria = getSession().createCriteria(entityClass);
//		for (Criterion c : criterions) {
//			criteria.add(c);
//		}
//		return criteria;
//	}
//	
//	@SuppressWarnings (value={"unchecked"})
//	public  List<T> find(String hql, Object... values) {
//		return hibernateTemplate.find(hql, values);
//	}

//	@SuppressWarnings (value={"unchecked"})
//	@Override
//	public List<T> criteriaFindBy(Class<T> entityClass, String propertyName, Object value) {
//		if (null == value)
//			return createCriteria(entityClass, Restrictions.isNull(propertyName)).list();
//
//		return createCriteria(entityClass, Restrictions.eq(propertyName, value)).list();
//	}
//	
//	@Override
//	public List<T> criteriaFind(String propertyName, Object value) {
//		return (List<T>) criteriaFindBy(entityClass, propertyName, value);
//	}
//	
//	@SuppressWarnings (value={"unchecked"})
//	@Override
//	public T findUniqueBy(Class<T> entityClass, String propertyName, Object value) {
//		return (T) createCriteria(entityClass, Restrictions.eq(propertyName, value)).addOrder(Order.desc(getId(entityClass))).setMaxResults(1).uniqueResult();
//	}
//	
//	@Override
//	public T findUnique(String propertyName, Object value) {
//		return (T) findUniqueBy(entityClass, propertyName, value);
//	}
//	@Override
//	public String getId(Class<T> clazz) {
//		ClassMetadata meta = sessionFactory.getClassMetadata(clazz);
//		String idName = meta.getIdentifierPropertyName();
//		return idName;
//	}
//
//	@Override
//	public Boolean isUnique(Class<T> entityClass, Object entity, String propertyNamesArr) {
//		Criteria criteria = createCriteria(entityClass).setProjection(Projections.rowCount());
//		String[] nameList = propertyNamesArr.split(",");
//		try {
//			for (String name : nameList) {
//				criteria.add(Restrictions.eq(name, PropertyUtils.getProperty(entity, name)));
//			}
//
//			String idName = getId(entityClass);
//
//			Serializable id = (Serializable) PropertyUtils.getProperty(entity, idName);
//
//			if (id != null){
//				criteria.add(Restrictions.not(Restrictions.eq(idName, id)));
//			}
//		} catch (Exception e) {
//			ReflectionUtils.handleReflectionException(e);
//		}
//		return (Integer) criteria.uniqueResult() == 0;
//	}

	@Override
	public List<Map<String, Object>> mapResultList(String excuteSql,Object... objects){
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		Connection connection = null;
	//	try{
			//DataSource ds = jdbcTemplate.getDataSource();
			//connection = ds.getConnection();
			//QueryRunner qr = new QueryRunner();
			try {
				connection = jdbcTemplate.getDataSource().getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result = (List<Map<String, Object>>)jdbcTemplate.queryForList(excuteSql);
			//result = (List<Map<String, Object>>)qr.query(connection, excuteSql, new MapListHandler(),objects);
			
		//}
	//	catch(Exception e){
	///		try {
		//		if(connection!=null&&!connection.isClosed()){
					try {
						DbUtils.close(connection);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
		//		}
	//		} catch (SQLException e1) {
				//e1.printStackTrace();
	//		}
		//	e.printStackTrace();
			
	//	}
//		finally{
//			try {
//				if(connection!=null&&!connection.isClosed()){
//					try {
//						DbUtils.close(connection);
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return result;
	}
	//一下为set和get方法

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<T> createSQLQuery(Class<T> entityClass, String sql,
			Object... values) {
		// TODO Auto-generated method stub
		return null;
	}


//	public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
	
}
