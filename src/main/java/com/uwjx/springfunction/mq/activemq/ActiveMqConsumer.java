package com.uwjx.springfunction.mq.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class ActiveMqConsumer {

    /***
     * description: 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
     */
    @JmsListener(destination = "uwjx.tanli-queue")
    public void receiveQueue(String text) {
       log.warn("Consumer收到的报文为: {} " , text);
    }
}
