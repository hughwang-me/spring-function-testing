package com.uwjx.springfunction.controller;

import com.uwjx.springfunction.ResultUtil;
import com.uwjx.springfunction.domain.ResultModel;
import com.uwjx.springfunction.mq.activemq.ActiveMqProducer;
import com.uwjx.springfunction.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
@RequestMapping(value = "activemq")
@Slf4j
public class ActiveMqController {

    @Autowired
    ActiveMqProducer activeMqProducer;

    @Autowired
    Queue queue;

    @GetMapping
    public ResultModel<Object> push(){
        log.warn("activemq 发送消息");
        activeMqProducer.sendMessage(queue , "王欢");
        return ResultUtil.success("ok");
    }

}
