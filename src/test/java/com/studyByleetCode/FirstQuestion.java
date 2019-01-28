package com.studyByleetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cherry
 * @version 1.0.0
 * @since 
 * 创建时间：Jan 22, 2019
 * 功能描述：找出数组中两个数刚好等于target的位置。
 * 官方网站：www.cindy.com
 * 邮箱地址：yichaotang@qq.com
 */
public class FirstQuestion {
	 public int[] twoSum(int[] nums, int target) {
	        int length = nums.length;
	        for (int i = 0; i < length; i++) {
	        	for (int j = i+1; j < length; j++) {
					if(nums[i]+nums[j] == target) {
						System.out.println("有");
						return new int[] {i,j};
					}
				}
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	 
	 public int[] twoSum1(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
}
