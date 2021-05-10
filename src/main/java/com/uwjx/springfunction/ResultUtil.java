package com.uwjx.springfunction;

import com.uwjx.springfunction.domain.ResultModel;

public class ResultUtil {

    private static final Integer SUCCESS = 200;

    private static final Integer FAILURE = -1;

    private static final String SUCCESS_MESSAGE = "请求处理成功";

    private static final String FAILURE_MESSAGE = "处理失败";

    public static ResultModel<Object> success(){
        ResultModel<Object> resultModel = new ResultModel<>();
        resultModel.setCode(SUCCESS);
        resultModel.setMessage(SUCCESS_MESSAGE);
        resultModel.setData("");
        return  resultModel;
    }

    public static ResultModel<Object> success(Object object){
        ResultModel<Object> resultModel = new ResultModel<>();
        resultModel.setCode(SUCCESS);
        resultModel.setMessage(SUCCESS_MESSAGE);
        resultModel.setData(object);
        return  resultModel;
    }

    public static ResultModel<Object> error(){
        ResultModel<Object> resultModel = new ResultModel<>();
        resultModel.setCode(FAILURE);
        resultModel.setMessage(FAILURE_MESSAGE);
        resultModel.setData("");
        return  resultModel;
    }
}
