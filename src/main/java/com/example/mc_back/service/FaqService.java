package com.example.mc_back.service;

import com.example.mc_back.repository.FaqRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FaqService {

    @Resource
    private FaqRepository faqRepository;
}
