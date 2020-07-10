package com.wsw.dubboprovider.service;

import com.wsw.dubboapi.api.service.CalculatorService;
import org.apache.dubbo.config.annotation.Service;

@Service(interfaceName = "calculatorService")
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b) {
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
        return c;
    }
}
