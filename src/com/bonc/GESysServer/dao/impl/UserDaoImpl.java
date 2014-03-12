package com.bonc.GESysServer.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;











import com.bonc.GESysServer.dao.BaseDao;
import com.bonc.GESysServer.dao.UserDao;
import com.bonc.GESysServer.pojo.User;
@Repository 
public class UserDaoImpl extends BaseDaoImpl implements UserDao{
	@Override
	public boolean userReg(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public UserDaoImpl(){
		super();
	}

	@Override
	public boolean userLogin(User user) {
		String excuteSql = "select * from USER";
		List<Map<String, Object>> userList = mapResultList(excuteSql);
		return userList.size()>0?true:false;
	}
}
