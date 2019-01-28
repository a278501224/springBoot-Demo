package com.study.dao;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.bean.User;
import com.study.mapper.UserMapper;

//对应数据访问层Bean
/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：2018年8月15日
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
//@Repository(value=”userDao”)注解是告诉Spring，让Spring创建一个名字叫“userDao”的UserDaoImpl实例。
//Service需要使用Spring创建的名为“userDao”的UserDaoImpl实例时， 
//就可以使用@Resource(name =”userDao”)注解告诉Spring，Spring把创建好的userDao注入给Service即可
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	private final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	//注解应用Mapper类资源
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByName(String username) {
		//调用Mapper类从数据库中得到User对象
		return userMapper.getUserByName(username);
//		return null;
		
	}

	@Override
	public User registerAnAccount(String username,String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		Integer insertUser = userMapper.insertUser(user);
		if(insertUser==1) {
			logger.info("数据库新增数据成功");
			return user;
		}
		return null;
	}

	@Override
	public Boolean getUsernameCount(String username) {
		Integer usernameCount = userMapper.getUsernameCount(username);
		if(usernameCount==1) {
			logger.info("用户名重复");
			return false;
		}
		logger.info("数据库没有重复的用户名");
		return true;
	}
}
