package pl.sdacademy.calculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void shouldValidateName() {
        //given
        double valueA = 5.2;
        double valueB = 3.1;
        Calculator calculator = new Calculator();
        //when
        double actualResult = calculator.add(valueA, valueB);
        //then
        assertEquals(8.3,actualResult);
    }

}