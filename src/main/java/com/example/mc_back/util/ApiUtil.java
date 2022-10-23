package com.example.mc_back.util;

import com.example.mc_back.common.CommonResult;
import com.example.mc_back.common.McApi;
import com.example.mc_back.enums.ApiCode;
import com.example.mc_back.mcException.McException;

public class ApiUtil {
    public static McApi getMsg(String code, String msg) {
        return new McApi(new CommonResult(code, msg));
    }

    public static McApi getMsg(McException e) {
        return ApiUtil.getMsg(e.getCode(), e.getMsg());
    }

    public static McApi getMsg(ApiCode errorCode) {
        return ApiUtil.getMsg(errorCode.getCode(), errorCode.getMsg());
    }
}
