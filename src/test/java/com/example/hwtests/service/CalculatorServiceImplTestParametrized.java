package com.example.hwtests.service;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTestParametrized {
    private static final CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> setUpArgumentsForTestPlus() {
        return Stream.of(
                Arguments.of(5, 1, "5 + 1 = 6", out.plus(5, 1)),
                Arguments.of(4, 3, "4 + 3 = 7", out.plus(4, 3)),
                Arguments.of(8, 2, "8 + 2 = 10", out.plus(8, 2))
        );
    }

    public static Stream<Arguments> setUpArgumentsForTestMinus() {
        return Stream.of(
                Arguments.of(5, 1, "5 - 1 = 4", out.minus(5, 1)),
                Arguments.of(4, 3, "4 - 3 = 1", out.minus(4, 3)),
                Arguments.of(8, 2, "8 - 2 = 6", out.minus(8, 2))
        );
    }

    public static Stream<Arguments> setUpArgumentsForTestMultiply() {
        return Stream.of(
                Arguments.of(5, 1, "5 * 1 = 5", out.multiply(5, 1)),
                Arguments.of(4, 3, "4 * 3 = 12", out.multiply(4, 3)),
                Arguments.of(8, 2, "8 * 2 = 16", out.multiply(8, 2))
        );
    }

    public static Stream<Arguments> setUpArgumentsForTestDivide() {
        return Stream.of(
                Arguments.of(5, 1, "5 / 1 = 5", out.divide(5, 1)),
                Arguments.of(4, 3, "4 / 3 = 1", out.divide(4, 3)),
                Arguments.of(8, 2, "8 / 2 = 4", out.divide(8, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestPlus")
    public void plus(Integer num1, Integer num2, String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestMinus")
    public void minus(Integer num1, Integer num2, String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestMultiply")
    public void multiply(Integer num1, Integer num2, String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("setUpArgumentsForTestDivide")
    public void divide(Integer num1, Integer num2, String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
    }
}
