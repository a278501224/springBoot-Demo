package com.study.constantsPool;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户返回map
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：2018年12月3日
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
public class UserRespMap {
	private static final Map<String, String> map = new HashMap<>();
	static {
		map.put("AE1001", "用户名或密码错");
		map.put("000000", "登陆成功");
	}
	
	public static String findRespMessage(String key) {
		String resMsg = map.get(key);
		if(resMsg==null) {
			resMsg="失败";
		}
		return resMsg;
	}
}
