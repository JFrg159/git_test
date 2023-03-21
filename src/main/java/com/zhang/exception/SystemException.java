package com.zhang.exception;

public class SystemException extends RuntimeException{
    private Integer Code ;

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public SystemException(String message, Integer Code) {
        super(message);
        this.Code= Code;
    }

    public SystemException(String message, Throwable cause, Integer Code) {
        super(message, cause);
        this.Code=Code;
    }

}
