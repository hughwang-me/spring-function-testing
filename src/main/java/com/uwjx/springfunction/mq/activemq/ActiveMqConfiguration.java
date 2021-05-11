package com.uwjx.springfunction.mq.activemq;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

@Slf4j
@Configuration
public class ActiveMqConfiguration {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("uwjx.tanli-queue");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("uwjx.tanli-topic");
    }
}
