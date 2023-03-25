package com.example.hwtests.service;

import com.example.hwtests.exceptions.IllegalArgument2Exception;
import com.example.hwtests.exceptions.NoArgumentException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoArgumentException("Укажите оба числа");
        }
        Integer result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoArgumentException("Укажите оба числа");
        }
        Integer result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoArgumentException("Укажите оба числа");
        }
        Integer result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoArgumentException("Укажите оба числа");
        }
        if (num2 == 0) {
            throw new IllegalArgument2Exception("Делить на ноль нельзя");
        }
        Integer result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
