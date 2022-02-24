package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void split() {
        String str = "a,b";
        assertThat(str.split(",")).contains("b");
        // 원소 정확히 일치
        assertThat(str.split(",")).containsExactly("a","b");
        assertThat(str.split(","))
                .contains("b")
                .containsExactly("a","b");

        String number = "1";
        assertThat(number.split(",")).contains(number);
        assertThat(number.split(",")).containsExactly(number);
        assertThat(str.split(","));


    }

    @Test
    void subString() {
        String str = "(1,2)";
        assertThat(str.substring(0,4)).contains("1,2");
    }

    @Test
    @DisplayName("인덱스 범위를 넘어서면 Exception 성공")
    void charAt() {
        String str = "abc";
        int index = 5;

        assertThatThrownBy(() -> {
            str.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("%d", index);

    }

}
