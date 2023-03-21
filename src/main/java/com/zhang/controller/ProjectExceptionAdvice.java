package com.zhang.controller;

import com.zhang.exception.BusinessException;
import com.zhang.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        //记录日志
        //发送消息
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙,请稍后再试");
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息
        return new Result(ex.getCode(), null, ex.getMessage());
    }

}

