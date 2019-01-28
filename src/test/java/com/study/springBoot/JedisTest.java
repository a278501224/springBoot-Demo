package com.study.springBoot;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class JedisTest {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@SuppressWarnings("unused")
	private void save() {
		stringRedisTemplate.opsForValue().set("zzp", "bingz");
		Assert.assertEquals("big z", stringRedisTemplate.opsForValue().get("zzp"));
	}
}
