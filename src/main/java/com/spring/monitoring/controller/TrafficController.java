package com.spring.monitoring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TrafficController {


    @GetMapping("/cpu")
    public String cpu() {
        log.info("cpu");
        long value =0;
        for (long i = 0; i < 100000000000L; i++) {
            value++;
        }
        return "ok value=" + value;
    }
}
