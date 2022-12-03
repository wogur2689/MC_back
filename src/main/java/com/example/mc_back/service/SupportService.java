package com.example.mc_back.service;

import com.example.mc_back.entity.SupportEntity;
import com.example.mc_back.param.SupportUser;
import com.example.mc_back.repository.SupportRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Map;

@Service
public class SupportService {

    @Resource
    private SupportRepository supportRepository;

    /**
     * 지원자의 지원정보 저장
     * @return code
     * @param map
     */
    @Transactional
    public String SupportContentSave(Map<String, Object> map) {
        SupportEntity supportEntity = SupportEntity.builder()
                .name(map.get("name").toString())
                .email(map.get("email").toString())
                .phone(map.get("phone").toString())
                .build();
        supportRepository.save(supportEntity);
        return "0000";
    }
}
