package com.studyByleetCode;

/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：Jan 23, 2019
 * 功能描述：
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
public class SevenQuestion {
	int result = 0;
	public int reverse(int x) {
		if(x!=0) {
			//获得末尾数
			int n = x%10;
			//降位
			x /= 10;
			if(result>Integer.MAX_VALUE/10||(result == Integer.MAX_VALUE/10&&n>7)) {
				result = 0;
				return result;
			}
			if(result<Integer.MIN_VALUE/10||(result == Integer.MIN_VALUE/10&&n<-8)) {
				result = 0;
				return result;
			}
			result = result*10 + n;
			System.out.println("结果:"+result);
			reverse(x);
		}
		return result;
	}
}
