package com.uwjx.springfunction.controller;

import com.uwjx.springfunction.ResultUtil;
import com.uwjx.springfunction.domain.ResultModel;
import com.uwjx.springfunction.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "devtools")
@Slf4j
public class DevToolsController {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResultModel<Object> get(){
        log.warn("测试日志");
        return ResultUtil.success(bookService.list());
    }

    @PutMapping
    public ResultModel<Object> put(){
        log.warn("测试日志");
        return ResultUtil.success(bookService.list());
    }
}
