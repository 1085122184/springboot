package com.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.Mq;

@Configuration
public class MyTest {
	@Bean
	public Mq ctest(){
		System.out.println("11111111111111111111111");
		return new Mq(2);
	}

}
