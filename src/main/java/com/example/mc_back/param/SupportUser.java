package com.example.mc_back.param;

import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class SupportUser {
    @NotNull(message = "이름을 입력해주세요.")
    private String name;    //이름

    @Email
    @NotNull(message = "이메일을 입력해주세요.")
    private String email;   //이메일

    @NotNull(message = "전화번호는 -없이 입력해주세요.")
    private String phone;   //핸드폰번호
}
