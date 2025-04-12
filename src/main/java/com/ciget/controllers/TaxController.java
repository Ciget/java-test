package com.ciget.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/tax")
public class TaxController {

    @RequestMapping("/")
    public String index() {
        log.info("Test logging");
        return "Spring Boot REST API";
    }
}
