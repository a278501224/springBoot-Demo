package com.study.dao;

import com.study.bean.User;

/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：2018年8月15日
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
public interface UserDao {
	/**
	 * 通过用户名获得接口对象
	 * @param username	用户名
	 */
	public User findUserByName(String username);
	
	/**
	 * 注册账号
	 * @return
	 */
	public User registerAnAccount(String username,String password);
	
	public Boolean getUsernameCount(String username);
	
}
