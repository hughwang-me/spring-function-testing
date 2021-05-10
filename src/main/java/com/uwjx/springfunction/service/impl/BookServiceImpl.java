package com.uwjx.springfunction.service.impl;

import com.uwjx.springfunction.dao.BookMapper;
import com.uwjx.springfunction.domain.entity.Book;
import com.uwjx.springfunction.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> list() {

        return bookMapper.list();
    }
}
