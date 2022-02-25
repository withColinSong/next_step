package study;


import org.assertj.core.util.Strings;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class setTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
    }

    @Test
    @DisplayName("set size check")
    void setTest() {
        int size = 3;
        assertThat(numbers.size()).isEqualTo(size);
    }

    @DisplayName("ParameterizedTest use value")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @Test
    @DisplayName("ParameterizedTest")
    @ParameterizedTest
    @ValueSource(ints = {4,5})
    void returnValueBoolean(int input) {
        if(numbers.contains(input)) {
            assertThat(numbers.contains(input)).isTrue();
        } else {
            assertThat(numbers.contains(input)).isFalse();
        }

    }

    @ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actualValue = input.toLowerCase();
        assertEquals(expected, actualValue);
    }
}

