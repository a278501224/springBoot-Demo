package com.study.springBoot;

public class SynchronizedTest implements Runnable {
	private  Object obj;//声明一个类的引用
	public SynchronizedTest(Object obj) {
		this.obj=obj;
	}

	@Override
	public void run() {
		synchronized(obj) {//给共享资源上锁
			for (int i = 1; i < 53; i++) {
				System.out.print(i);
				if(i%2==0) {
					obj.notify();//唤醒其他线程
					try {
						obj.wait();//等待并释放锁
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
}
