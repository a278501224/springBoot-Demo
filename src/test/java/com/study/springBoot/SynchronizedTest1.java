package com.study.springBoot;

public class SynchronizedTest1 implements Runnable {
	private Object obj;
	public SynchronizedTest1(Object obj) {
		this.obj=obj;
	}
	
	@Override
	public void run() {
		synchronized (obj) {
			for (int i = 0; i < 26; i++) {
				System.out.print((char)(i+'A'));
				obj.notify();
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
