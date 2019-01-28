package com.studyByleetCode;

import java.util.HashMap;
import java.util.Map;

public class ThirteenQuestion {
	public  int fuc(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] sc = s.toCharArray();
		//最后结果
		int total = map.get(sc[0]);
		//需要加的值
		int pre = map.get(sc[0]);
		for (int i = 1; i < sc.length; i++) {
			//每次循环获得的value
			int cur = map.get(sc[i]);
			if(cur<=pre) {
				total +=cur;
			}else {
				total = total+cur-2*pre;
			}
			pre = cur;
		}
		return total;
	}
}
