package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"AlaMakota"})
    public void checkIfUsernameFulfilsTheConditionOfPattern(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"ala.makota@gmail.com"})
    public void checkIfUsernameFulfilsTheConditionOfPattern2(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
}