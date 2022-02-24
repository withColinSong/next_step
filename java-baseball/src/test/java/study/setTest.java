package study;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    @DisplayName("ParameterizedTest use value")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }
}
