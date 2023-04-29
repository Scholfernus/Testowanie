package pl.sdacademy.Person;

public class PersonFactory {

    Person createPerson(String firstName, String lastName) {
        String prefix = firstName.endsWith("a") ? "Ms" : "Mr";
        // createPerson("Paul", "Hol");
        return new Person(prefix, firstName, lastName);
    }
}
