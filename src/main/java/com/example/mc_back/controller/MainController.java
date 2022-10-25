package com.example.mc_back.controller;

import com.example.mc_back.common.CommonResult;
import com.example.mc_back.common.McApi;
import com.example.mc_back.enums.ApiCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("v1/api")
public class MainController {

    /* 공지사항 */
    @PostMapping("/notice")
    public McApi getNotice() {
        return new McApi(new CommonResult(ApiCode.API_0000.getCode(), ApiCode.API_0000.getMsg()));
    }
    /* 자주하는 질문 */
    @PostMapping("/faq")
    public McApi getFaq() {
        return new McApi(new CommonResult(ApiCode.API_0000.getCode(), ApiCode.API_0000.getMsg()));
    }

    /* 자주하는 질문 답변 */
    @PostMapping("/faq_answer")
    public McApi getFaqAnswer() {
        return new McApi(new CommonResult(ApiCode.API_0000.getCode(), ApiCode.API_0000.getMsg()));
    }
}
