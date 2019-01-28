package com.study.springBoot;

public class SynchronizedTest2 {
	public static void main(String[] args) {
		Object obj = new Object();
		SynchronizedTest number = new SynchronizedTest(obj);
		SynchronizedTest1 letter =new SynchronizedTest1(obj);
		Thread th1 =new Thread(number);
		Thread th2=new Thread(letter);
		th1.start();//数字线程先运行
		th2.start();
	}
}
