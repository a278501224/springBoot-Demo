package com.study.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.bean.User;
import com.study.service.UserService;


/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：2018年8月15日
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
//@Controller对应表现层的Bean，也就是Action
//注意：如果@Controller不指定其value【@Controller】，则默认的bean名字为这个类的类名首字母小写，
//如果指定value【@Controller(value=”UserAction”)】或者【@Controller(“UserAction”)】，
//则使用value作为bean的名字。

//@Scope(“prototype”)表示将Action的范围声明为原型
//可以利用容器的scope=”prototype”来保证每一个请求有一个单独的Action来处理，避免struts中Action的线程安全问题。
//spring 默认scope 是单例模式(scope=”singleton”)，这样只会创建一个Action对象，每次访问都是同一Action对象，数据不安全。
//struts2 是要求每次次访问都对应不同的Action，scope=”prototype” 可以保证当有请求的时候都创建一个Action对象

//@RequestMapping(“/user”)
//RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。
//用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
@Controller
@RequestMapping("/user")
public class UserController {
	private final static Logger logger= LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/customerIndex")
	public String customerIndex() {
		return "customerIndex";
	}
	
	@RequestMapping("/login")
	public String login(User user, Model model) {
		user=userService.checkLogin(user.getUsername(), user.getPassword());
		logger.info("user:"+user);
		if(!StringUtils.isEmpty(user)) {
			model.addAttribute(user);
			logger.info("登陆成功");
			return "customerLoginSuccess";
		}
		return "customerLoginFailed";
	}
	
	@RequestMapping("/register")
	public String register(User user,Model model) {
		user=userService.checkRegister(user.getUsername(), user.getPassword());
		logger.info("user:"+user);
		if(!StringUtils.isEmpty(user)) {
			model.addAttribute(user);
			return "registerSuccess";
		}
		return "registerFailed";
	}
}
