package com.uwjx.springfunction.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Book {

    /**
     * 主键 ID
     */
    private Integer id;

    /**
     * 书名
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 价格
     */
    private Double price;

    /**
     * 出版日期
     */
    private Date publishDate;
}
