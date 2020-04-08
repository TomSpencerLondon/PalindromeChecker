package com.codurance.is_palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeShould {

    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @ParameterizedTest
    @CsvSource({
            "abcdcba",
            "abcdefghhgfedcba",
            "abcdefghihgfedcba"
    })
    void return_true_for_string(String phrase) {
        assertTrue(palindrome.check(phrase));
    }

    @ParameterizedTest
    @CsvSource({
            "abcdefghihgfeddcba"
    })
    void return_false_for_string(String phrase) {
        assertFalse(palindrome.check(phrase));
    }
}
