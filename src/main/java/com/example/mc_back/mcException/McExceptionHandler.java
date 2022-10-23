package com.example.mc_back.mcException;

import com.example.mc_back.common.McApi;
import com.example.mc_back.enums.ApiCode;
import com.example.mc_back.util.ApiUtil;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class McExceptionHandler {

    /**
     * ErrorCode Exception
     */
    @ExceptionHandler({McException.class})
    public McApi HyeokException(McException e) {
        return ApiUtil.getMsg(e);
    }

    /**
     * Json Parsing Error
     */
    @ExceptionHandler({HttpMessageNotReadableException.class, IllegalArgumentException.class})
    public McApi httpMessageNotReadableException() {
        return ApiUtil.getMsg(ApiCode.API_1001);
    }

    /**
     * Exception.class
     */
    @ExceptionHandler({Exception.class})
    public McApi exception() {
        return ApiUtil.getMsg(ApiCode.API_9999);
    }
}
