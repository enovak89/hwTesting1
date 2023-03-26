package com.example.hwtests.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = {CalculatorServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CalculatorServiceImplTestParametrized {
    @Autowired
    private CalculatorServiceImpl calculatorService;


    public static Stream<Arguments> setUpArgumentsForTestPlus() {
        return Stream.of(
                Arguments.of(5, 1, "5 + 1 = 6"),
                Arguments.of(4, 3, "4 + 3 = 7"),
                Arguments.of(8, 2, "8 + 2 = 10")
        );
    }

    public static Stream<Arguments> setUpArgumentsForTestMinus() {
        return Stream.of(
                Arguments.of(5, 1, "5 - 1 = 4"),
                Arguments.of(4, 3, "4 - 3 = 1"),
                Arguments.of(8, 2, "8 - 2 = 6")
        );
    }

    public static Stream<Arguments> setUpArgumentsForTestMultiply() {
        return Stream.of(
                Arguments.of(5, 1, "5 * 1 = 5"),
                Arguments.of(4, 3, "4 * 3 = 12"),
                Arguments.of(8, 2, "8 * 2 = 16")
        );
    }

    public static Stream<Arguments> setUpArgumentsForTestDivide() {
        return Stream.of(
                Arguments.of(5, 1, "5 / 1 = 5"),
                Arguments.of(4, 3, "4 / 3 = 1"),
                Arguments.of(8, 2, "8 / 2 = 4")
        );
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestPlus")
    public void plus(Integer num1, Integer num2, String expectedResult) {
        assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestMinus")
    public void minus(Integer num1, Integer num2, String expectedResult) {
        assertEquals(expectedResult, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestMultiply")
    public void multiply(Integer num1, Integer num2, String expectedResult) {
        assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestDivide")
    public void divide(Integer num1, Integer num2, String expectedResult) {
        assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }
}
