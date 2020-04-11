package com.cache.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cache.UserCacheService;
import com.dao.UserMapper;
import com.domain.User;
import com.utils.RedisUtils;
@Component
public class UserCacheServiceImpl implements UserCacheService{

	@Autowired
	RedisUtils redisUtils;
	@Autowired
	UserMapper mapper;
	
	@PostConstruct
	@Override
	public int addCache() {
		System.out.println("开始缓存数据 -------------");
		List<User> list = mapper.selectAll();
		for(int i=0;i<900;i++){
			System.out.println("缓存第"+i+"次");
			redisUtils.set(i+"",list.get(i));
		}
		System.out.println("结束缓存----------");
		return 0;
	}


}
