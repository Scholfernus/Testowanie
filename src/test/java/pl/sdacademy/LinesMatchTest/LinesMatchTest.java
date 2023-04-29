package pl.sdacademy.LinesMatchTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinesMatchTest {
    @Test
    void shouldValidateStringLines() {
        //List<String> expectedLines = Stream.of("r.*").collect(Collectors.toList());// alternatywny sposób dodania
        List<String> expectedLines = new ArrayList<>(); //Sprawdź czemu ci nie działał kod
        expectedLines.add("r.*");
        List<String> actualLines = new ArrayList<>();
        actualLines.add("ryzykownie");
        // when + then
        Assertions.assertLinesMatch(expectedLines, actualLines);
    }
}
