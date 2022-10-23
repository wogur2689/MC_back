package com.example.mc_back.mcException;

import com.example.mc_back.enums.ApiCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class McException extends RuntimeException{
    /**
     * 오류 코드
     */
    private String code;

    /**
     * 오류 메시지
     */
    private String msg;

    /**
     * 오류 메시지 처리
     * @param code
     * @param msg
     */
    public McException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public McException(ApiCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }
}
