package com.study.service;

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
public interface UserService {
	/**
	 * 通过用户名和密码核查用户登陆
	 * @param username	用户名
	 * @param password	密码
	 * @return
	 */
	public User checkLogin(String username,String password);
	
	/**
	 * 注册
	 * @return
	 */
	public User checkRegister(String username,String password);
	
//	public Boolean checkUsername(String username);
}
