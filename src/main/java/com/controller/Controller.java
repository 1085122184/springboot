package com.controller;

import com.alibaba.fastjson.JSON;
import com.domain.User;
import com.service.UserService2;
import com.service.UserService3;
import com.utils.SendMq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
//    @Autowired
//    UserService servie1;
    @Autowired
    UserService2 servie2;
    @Autowired
    SendMq send;
    @Autowired
    UserService3 servie3;
    @Autowired
    ApplicationContext context;
    //
    @GetMapping("/sendDirectMessage")
    public String sendDirectMessage()  {
    	long startTime = System.currentTimeMillis();
    	for(int i=0;i<90000;i++){
    		System.out.println("执行第"+i+"次");
    		servie3.test(3);
    	}
    	
        //send.send(new Mq(110));
       // send.send(new Mq(100));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");
//    	long startTime = System.currentTimeMillis();
//    	servie1.test();
//    	servie2.test();
//    	servie3.test();
//    	long endTime = System.currentTimeMillis();
//    	System.out.println(endTime-startTime+"ms");
        return "ok";
    }
    @GetMapping("/test")
    public String test()  {
    	User user = new User();
		user.setEmail("qwer");
		user.setName("shabi");
		System.out.println(JSON.toJSONString(user));
    	return "ok";
    }
}
