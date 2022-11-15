package com.example.mc_back.controller;

import com.example.mc_back.common.CommonResult;
import com.example.mc_back.common.McApi;
import com.example.mc_back.enums.ApiCode;
import com.example.mc_back.mcException.McException;
import com.example.mc_back.service.FaqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("v1/api")
public class MainController {

    @Resource
    private FaqService faqService;

    /* 공지사항 */
    @PostMapping("/notice")
    public McApi getNotice() {
        return new McApi(new CommonResult(ApiCode.API_0000.getCode(), ApiCode.API_0000.getMsg()));
    }

    /* 자주하는 질문 */
    @PostMapping("/faq")
    public McApi getFaq(HttpServletRequest request, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            //검증 오류
            log.info("bindResult : {}", bindingResult);
            throw new McException(ApiCode.API_1001);
        }
        //자주하는 질문 저장
        String code = faqService.faqSave(request);
        String msg = String.valueOf(ApiCode.valueOf(code));
        log.info("### msg {}", msg);

        return new McApi(new CommonResult(code, ApiCode.API_0000.getMsg()));
    }

    /* 자주하는 질문 답변 */
    @PostMapping("/faq_answer")
    public McApi getFaqAnswer() {
        return new McApi(new CommonResult(ApiCode.API_0000.getCode(), ApiCode.API_0000.getMsg()));
    }
}
