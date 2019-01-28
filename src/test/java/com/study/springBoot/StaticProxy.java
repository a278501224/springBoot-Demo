package com.study.springBoot;

public class StaticProxy implements ProxyInterface{
	private ProxyInterface proxyInterface;

	/**
	 * 通过构造方法获取到目标对象
	 * @param proxyInterface
	 */
	public StaticProxy(ProxyInterface proxyInterface) {
		this.proxyInterface = proxyInterface;
	}

	@Override
	public void writting() {
		System.out.println("1");
		proxyInterface.writting();
		System.out.println("2");
	}
	
	
	
}
