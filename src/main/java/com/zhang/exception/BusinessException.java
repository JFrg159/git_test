package com.zhang.exception;

public class BusinessException extends RuntimeException{
    private Integer Code ;

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public BusinessException(String message, Integer Code) {
        super(message);
        this.Code= Code;
    }

    public BusinessException(String message, Throwable cause, Integer Code) {
        super(message, cause);
        this.Code=Code;
    }

}
