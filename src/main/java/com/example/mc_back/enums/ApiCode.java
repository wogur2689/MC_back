package com.example.mc_back.enums;

import lombok.Getter;

@Getter
public enum ApiCode {
    /* Api 규격서 코드*/
    API_0000("0000", "성공")
    ,API_1000("1000", "입력값 부족")
    ,API_1001("1001", "데이터 형식 미일치")
    ,API_1003("1002", "네트워크 에러")

    /* 지원하기 */
    ,API_2000("2000", "지원 완료되었습니다.")
    ,API_2001("2001", "이름을 정확하게 입력하세요.")
    ,API_2002("2002", "이메일을 정확하게 입력하세요.")
    ,API_2003("2003", "전화번호를 정확하게 입력하세요.")

    /* 기타오류 */
    ,API_9998("9998", "일시적인 오류입니다. 다시 시도해주세요.")
    ,API_9999("9999", "시스템 오류");

    private String code;
    private String msg;

    ApiCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
