package com.example.hwtests.service;

import com.example.hwtests.exceptions.IllegalArgument2Exception;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private CalculatorService out = new CalculatorServiceImpl();

    Integer num1 = 5;
    Integer num2 = 1;
    Integer num3 = 8;
    Integer num4 = 2;


    @Test
    void plus() {
        String expectedResult = "5 + 1 = 6";
        assertEquals(expectedResult, out.plus(num1, num2));
    }

    @Test
    void plus2() {
        String expectedResult = "8 + 2 = 10";
        assertEquals(expectedResult, out.plus(num3, num4));
    }

    @Test
    void minus() {
        String expectedResult = "5 - 1 = 4";
        assertEquals(expectedResult, out.minus(num1, num2));
    }

    @Test
    void minus2() {
        String expectedResult = "8 - 2 = 6";
        assertEquals(expectedResult, out.minus(num3, num4));
    }

    @Test
    void multiply() {
        String expectedResult = "5 * 1 = 5";
        assertEquals(expectedResult, out.multiply(num1, num2));
    }

    @Test
    void multiply2() {
        String expectedResult = "8 * 2 = 16";
        assertEquals(expectedResult, out.multiply(num3, num4));
    }

    @Test
    void divide() {
        String expectedResult = "5 / 1 = 5";
        assertEquals(expectedResult, out.divide(num1, num2));
    }

    @Test
    void divide2() {
        String expectedResult = "8 / 2 = 4";
        assertEquals(expectedResult, out.divide(num3, num4));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgument2Exception.class, () -> out.divide(num1, 0));
    }


}