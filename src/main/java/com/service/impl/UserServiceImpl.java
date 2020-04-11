package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.domain.User;
import com.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper mapper;
	
	@Override
	public void test() {
		try {
			System.out.println("service1开始了");
			User user = new User();
			user.setEmail("service1@com");
			user.setName("service1");
			mapper.insert(user);
			List<User> list = mapper.selectAll();
			for (User user2 : list) {
				System.out.println("service1select"+user2.getName());
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
