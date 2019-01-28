package com.study.mapper;

import com.study.bean.User;

/**
 * mapper实现增删改查
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：2018年8月15日
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
public interface UserMapper {
	/**
	 * 通过用户名获取对象的方法
	 * @param username	用户名
	 * @return
	 */
	public User getUserByName(String username);
	
	/**
	 * @return
	 */
	public Integer insertUser(User user);
	
	/**
	 * 校验用户名是否存在
	 * @param username	用户名
	 * @return
	 */
	public Integer getUsernameCount(String username);
	
	
}
