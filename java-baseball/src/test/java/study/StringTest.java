package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void substring() {
        String str = "a,b";
        assertThat(str.split(",")).contains("b");
        // 원소 정확히 일치
        assertThat(str.split(",")).containsExactly("a","b");

        String number = "1";
        assertThat(number.split(",")).contains(number);
        assertThat(number.split(",")).containsExactly(number);

    }
}
