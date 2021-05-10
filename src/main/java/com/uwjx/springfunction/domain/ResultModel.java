package com.uwjx.springfunction.domain;

import lombok.Data;

@Data
public class ResultModel<T> {

    private Integer code;

    private String message;

    private T data;
}
