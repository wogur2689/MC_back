package com.example.mc_back.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PingController {

    @GetMapping("v1/api/ping")
    public String pingTest() {
        return "연결 성공!";
    }

}
