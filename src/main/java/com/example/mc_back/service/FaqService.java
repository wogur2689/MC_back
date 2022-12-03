package com.example.mc_back.service;

import com.example.mc_back.entity.FaqEntity;
import com.example.mc_back.mcException.McException;
import com.example.mc_back.repository.FaqRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Service
public class FaqService {

    @Resource
    private FaqRepository faqRepository;

    //질문 저장
    @Transactional(readOnly = true)
    public String faqSave(HttpServletRequest request) {
        log.info("### faqSave Loding... ###");
        try {
            FaqEntity faqEntity = FaqEntity.builder()
                    .faqContent(request.getParameter("faqContent"))
                    .faqAnswerCheck(request.getParameter("faqAnswerCheck"))
                    .build();
            faqRepository.save(faqEntity);
        } catch (McException e) {
            return e.getCode();
        }
        log.info("### faqSave Success! ###");
        return "0000";
    }
}
