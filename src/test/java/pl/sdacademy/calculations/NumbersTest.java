package pl.sdacademy.calculations;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    private Numbers numbers;

    @BeforeEach
    void beforeEach() {
        this.numbers = new Numbers();
    }

    @Test
    void shouldFindFirstDigitInString() {
        // given
        String value = "def354fgh";
        int expectedValue = 3;
        // when
        OptionalInt possibleFirstDigit = numbers.findFirstDigit(value);
        // then
        Assertions.assertThat(possibleFirstDigit).isNotNull()
                .isPresent()
                .hasValue(expectedValue);
    }

    @Test
    void shouldNotFindAnyDigitWhenThereAreNone() {
        // given
        String value = "abc";
        // when
        OptionalInt possibleFirstDigit = numbers.findFirstDigit(value);

        // then
        Assertions.assertThat(possibleFirstDigit)
                .isNotNull()
                .isEmpty();
    }
}