package com.example.mc_back.enums;

import lombok.Getter;

@Getter
public enum ApiCode {
    /* Api 규격서 코드*/
    API_0000("0000", "성공")
    ,API_1000("1000", "입력값 부족")
    ,API_1001("1001", "데이터 형식 미일치")
    ,API_1003("1002", "네트워크 에러")

    /* 기타오류 */
    ,API_9999("9999", "기타 오류");

    private String code;
    private String msg;

    ApiCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
