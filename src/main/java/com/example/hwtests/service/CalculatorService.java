package com.example.hwtests.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
public interface CalculatorService {
    String plus(Integer num1, Integer num2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);
}
