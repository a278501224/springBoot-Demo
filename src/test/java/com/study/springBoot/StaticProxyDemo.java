package com.study.springBoot;

public class StaticProxyDemo {
	public static void main(String[] args) {
		ProxyInterface target = new ProxyService();
		StaticProxy proxy = new StaticProxy(target);
		proxy.writting();
	}
}
