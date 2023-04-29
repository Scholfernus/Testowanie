package pl.sdacademy.calculations.Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameVerifierTest {
    @Test
    void shouldValidateName() {
        //given
        String name1 = "Paul";
        NameVerifier nameVerifier = new NameVerifier();
        //when
        boolean actualResult = nameVerifier.isNameValid(name1);
        //then
        assertTrue(actualResult);
    }

    @Test
    void shouldNotValidEmptyName() {
        //given
        String name1 = "";
        NameVerifier nameVerifier = new NameVerifier();
        //when
        boolean actualResult = nameVerifier.isNameValid(name1);
        //then
        assertFalse(actualResult);
    }

    @Test
    void shouldNotValidateNullableName() {
        //given
        String name1 = null;
        NameVerifier nameVerifier = new NameVerifier();
        //when
        boolean actualResult = nameVerifier.isNameValid(name1);
        //then
        assertFalse(actualResult);
    }

    @Test
    void shouldValidateNameWhenAllLettersAreLowerCase() {
        //given
        String name1 = "paul";
        NameVerifier nameVerifier = new NameVerifier();
        //when
        boolean actualResult = nameVerifier.isNameValid(name1);
        //then
        assertFalse(actualResult);
    }
}