package com.study.springBoot;

import java.util.Calendar;

public class Test {
	@org.junit.Test
	public void test() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal+"======");
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month);
	}
}
