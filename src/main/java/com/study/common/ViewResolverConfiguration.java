package com.study.common;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

//@Configuration
public class ViewResolverConfiguration extends WebMvcAutoConfiguration {
//
//	/**
//	 * 支持FreeMarker
//	 * 
//	 * @return
//	 */
//	@Bean
//	public FreeMarkerViewResolver getFreeMarker() {
//		FreeMarkerViewResolver t = new FreeMarkerViewResolver();
//		t.setCache(true);
//		t.setPrefix("");
//		t.setSuffix(".html");
//		t.setRequestContextAttribute("request");
//		t.setOrder(0);
//		t.setContentType("text/html;charset=UTF-8");
//		return t;
//	}
//
//	/**
//	 * 支持Jsp
//	 * @return
//	 */
//	@Bean
//	public ViewResolver getJsp() {
//		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//		internalResourceViewResolver.setPrefix("/templates/");
//		internalResourceViewResolver.setSuffix(".jsp");
//		internalResourceViewResolver.setOrder(1);
//		return internalResourceViewResolver;
//	}
}
