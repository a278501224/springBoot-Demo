package com.studyByleetCode;

public class NigthQuestion {
	 public boolean isPalindrome(int x) {
		 int res = reverse(x);
		 System.out.println(res);
		 if(res==x&&!(res<0)) {
			 return true;
		 }else {
			 return false;
		 }
	 }
		 
	 
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
