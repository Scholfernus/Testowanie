package pl.sdacademy.calculations.Validator;

public class NameVerifier {
    boolean isNameValid(String name) {
        return name != null && !name.isBlank()
                && !name.equals(name.toUpperCase())
                && !name.equals(name.toLowerCase());

    }
}
