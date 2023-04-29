package pl.sdacademy.Person;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {
    @Test
    @DisplayName(" Should Create female person with expected 'Ms' prefix")
    void shouldCreateFemalePerson() {
        // given
        PersonFactory personFactory = new PersonFactory();
        String firstName = "Karolina";
        String lastName = "Kowalska";
        Person expectedPerson = new Person("Ms", firstName, lastName);
        // when
        Person actualPerson = personFactory.createPerson(firstName, lastName);
        // then
        assertNotNull(actualPerson);
        assertEquals(expectedPerson, actualPerson);
        // alternatywne rozwiązanie
        assertAll(
                () -> assertEquals("Ms", actualPerson.getPrefix()),
                () -> assertEquals(firstName, actualPerson.getFirsName()),
                () -> assertEquals(lastName, actualPerson.getLastName())
        );
    }

    @Test

    void shouldCreateMalePerson() {
        // given
        PersonFactory personFactory = new PersonFactory();
        String firstName = "Józef";
        String lastName = "Kowalski";
        Person expectedPerson = new Person("Mr", firstName, lastName);
        // when
        Person actualPerson = personFactory.createPerson(firstName, lastName);
        // then
        assertNotNull(actualPerson);
        assertNotSame(expectedPerson,actualPerson);
        assertEquals(expectedPerson, actualPerson);
        // alternatywne rozwiązanie
        assertAll(
                () -> assertEquals("Mr", actualPerson.getPrefix()),
                () -> assertEquals(firstName, actualPerson.getFirsName()),
                () -> assertEquals(lastName, actualPerson.getLastName())
        );
    }
}