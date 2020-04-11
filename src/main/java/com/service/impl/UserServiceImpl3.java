package com.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.domain.User;
import com.service.UserService3;
import com.utils.RedisUtils;
@Service
public class UserServiceImpl3 implements UserService3{
	@Autowired
	UserMapper mapper;
	@Autowired
	RedisUtils<?> redisUtils;
	@Override
	@Async
	public void test(int i) {
		try {
			System.out.println("service3开始了");
			User user = new User();
			user.setEmail("service3@com");
			user.setName("service3");
			mapper.insert(user);
			//User user1 = mapper.selectByPrimaryKey(i);
			//User user1 = (User) redisUtils.get(i+"");
//			for (User user2 : list) {
//				System.out.println("service3select"+user2.getName());
//			}
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
