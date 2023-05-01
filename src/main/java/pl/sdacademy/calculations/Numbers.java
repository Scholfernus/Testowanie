package pl.sdacademy.calculations;

import java.util.OptionalInt;

public class Numbers {
    // "123abc45def" -> [1]
    // "def354fgh" -> [3]
    // "xyz9" -> [9]
    // "987654321" -> [9]
    // "abc" -> []
    // "    " -> []
    // "" -> []
    // null -> []
    OptionalInt findFirstDigit(String value) {
        if (value == null)
            return OptionalInt.empty();

        char[] chars = value.toCharArray();
        int num = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                num = Character.getNumericValue(c);
                return OptionalInt.of(num);
            }
        }
    }
}




