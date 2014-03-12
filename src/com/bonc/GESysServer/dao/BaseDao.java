package com.bonc.GESysServer.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * baseDao interface
 * @author 项征
 * @date  2013-09-13
 * @see 提供hibernate操作的基础方法
 * 
 * */
public interface BaseDao<T,ID extends Serializable> {
	
	/**
	 * 创建对象，执行插入
	 * 
	 * @param entity 创建的实体对象
	 * @return T 返回操作的实体对象
	 * */
	public T create(T entity) throws Exception;
	
	/**
	 * 保存实体
	 * 
	 * @param entity 保存的实体对象
	 * @return T 返回操作的实体对象
	 * */
	public T save(T entity) throws Exception;
	
	/**
	 * 更新对象
	 * 
	 * @param entity 更新的实体对象
	 * @return 返回操作的实体对象
	 */
	public T update(T entity) throws Exception;

	/**
	 * 保存或更新对象
	 * 
	 * @param entity 保存或者更新的实体对象
	 * @return T 返回操作的实体对象
	 */
	public T saveOrUpdate(T entity) throws Exception;
		
	/**
	 * 删除对象
	 * 
	 * @param entity 删除的实体对象
	 */
	public void delete(T entity) throws Exception;
		
	/**
	 * 由主键获得实体实例<br>
	 * get()方法在一级缓存没有找到会直接查询数据库，不会去二级缓存中查找。
	 * 
	 * @param id 实体的主键
	 * @return T 返回id的实体
	 */
	 public T get(ID id) throws Exception;
	 
	 /**
	  * 由主键获得实体实例<br>
	  * load()方法会使用二级缓存，在一级缓存没有找到会直接查询数据库，会去二级缓存中查找。
	  * 
	  * @param id 准备加载实体的主键
	  * @return T 返回id的实体
	  */
	public T load(ID id) throws Exception;
	
	/**
	 * 根据ID删除实体
	 * 
	 * @param id
	 */
	public void removeById(ID id) throws Exception;
	/**
	 * 根据实体删除
	 * 
	 * @param id
	 */
	 public void remove(T t) throws Exception;
	 
//	 /**
//	 * 创建HQL查询,通过hibernate模板find方法进行查询<br>
//	 * hibernate中的find是根据主键首先去缓存中查找，找到就直接返回，找不到就接着去数据库中查找；
//	 * 
//	 * @param hql
//	 * @param values
//	 * @return HQL所查询的实体集合
//	 */
//	 public List<T> find(String hql, Object... values);
	/**
	 * 利用sql查询列表,将结果集直接封装到对应的实体类中，并返回list集合
	 * 
	 * @author 项征
	 * @param sql HQL语句
	 * @return list  
	 * 		将结果集封装到实体类中，并返回对应的list集合
	 */
	public List<T> querySQLObjectList(String hql,Object... values) ;
		
	/**
	 * 创建SQLQuery查询
	 * 
	 * @param <T> 设置泛型
	 * @param entityClass 映射bean的class类型
	 * @param sql SQL语句
	 * @param values 动态的将SQL赋值的数组
	 * @return list 指定bean的list结果集
	 */
	public List<T> createSQLQuery(Class<T> entityClass, String sql, Object... values);
		
	/**
	 * 通过jdbc源生模板，查询结果转化为map形式存储在list集合中
	 * @parame sql 查询的SQL语句
	 * @param objects SQL语句中的参数赋值数组
	 * */
	public List<Map<String, Object>> mapResultList(String sql,Object... objects);
	
}
