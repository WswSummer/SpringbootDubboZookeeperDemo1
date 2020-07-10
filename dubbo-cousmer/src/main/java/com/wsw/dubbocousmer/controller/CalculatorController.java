package com.wsw.dubbocousmer.controller;

import com.wsw.dubboapi.api.service.CalculatorService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Reference
    private CalculatorService calculatorService;

    @GetMapping("/hello")
    public int hello(){
        return calculatorService.add(2, 7);
    }
}
