package com.study.springBoot;

/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：Jan 18, 2019
 * 功能描述：目标对象实现了目标接口
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
public class ProxyService implements ProxyInterface{

	@Override
	public void writting() {
		System.out.println("Strarting writting!");
	}
	
}
