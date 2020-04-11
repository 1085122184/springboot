package com.utils;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.Mq;
import com.handler.HandlerFactory;
@Component
@RabbitListener(queues = "hello")
public class ReceiveMq {
	@Autowired
	HandlerFactory factory;
	
    @RabbitHandler
    public void process(Mq mq) {
    	int type = mq.getType();
    	factory.getHandler(type).handler("123");
    }

}