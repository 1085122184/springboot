package com.utils;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.Mq;

@Component
public class SendMq {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(Mq mq) {
        this.rabbitTemplate.convertAndSend("hello", mq);
    }

}