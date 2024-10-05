package me.algo.hashing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstCharacterTest {

    @Test
    @DisplayName("한번만 사용한 최초문자")
    void first_character() {
        // given
        String input = "statitsics";
        FirstCharacter firstCharacter = new FirstCharacter();

        // when
        int result = firstCharacter.solution(input);

        // then
        assertThat(result).isEqualTo(3);
    }

}
