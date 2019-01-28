package com.study.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.study.bean.User;
import com.study.dao.UserDao;
import com.study.dao.UserDaoImpl;
import com.study.mapper.UserMapper;

/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：2018年8月15日
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
//@Service对应的是业务层Bean
//这样当Action需要使用UserServiceImpl的的实例时,就可以由Spring创建好的”userService”注入给Action：
//在Action只需要声明一个名字叫“userService”的变量来接收由Spring注入的”userService”即可
@Service("userService")
public class UserServiceImpl implements UserService{
	private final static Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	
//	@Resource(name="userDao")
	@Autowired
	private UserDao userDao;
//	
//	private User user;
//	@Resource
	@Autowired
	private UserMapper userMapper;
//	@Resource
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	
	
	@Override
	public User checkLogin(String username, String password) {
		//根据用户名实例化用户对象
		User user=userDao.findUserByName(username);
//		User user=userMapper.getUserByName(username);
		if(!StringUtils.isEmpty(user)&&user.getPassword().equals(password)&&user.getUsername().equals(username)) {
			logger.info("返回的用户信息:"+user);
			return user;
		}
		logger.info("错误的用户名:"+username+"或错误的密码"+password);
		return  null;
	}

	@Override
	public User checkRegister(String username,String password) {
		if(userDaoImpl.getUsernameCount(username)){
			User user = userDao.registerAnAccount(username,password);
			return user;
		}else {
			
			return null;
		}
	}
	
}
