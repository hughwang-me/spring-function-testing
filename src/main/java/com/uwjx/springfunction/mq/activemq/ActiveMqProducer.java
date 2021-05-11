package com.uwjx.springfunction.mq.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service
@Slf4j
public class ActiveMqProducer {

    /**
     * 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
     */
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /***
     * description: 发送消息，destination是发送到的队列，message是待发送的消息
     * @param destination
     * @param message
     * @return void
     * @author lvjijun
     * @time 2020-10-19 10:52
     */
    public void sendMessage(Destination destination, final String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
