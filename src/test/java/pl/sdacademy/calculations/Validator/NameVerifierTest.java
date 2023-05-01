package pl.sdacademy.calculations.Validator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameVerifierTest {
    private NameVerifier nameVerifier;
    @BeforeAll
    static  void beforeAll(){
        System.out.println("In before ...");
    }
    @BeforeEach
        void beforeEach() {
        this.nameVerifier = new NameVerifier();
    }

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