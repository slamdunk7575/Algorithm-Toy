package me.algo.array;

import me.algo.datastructure.array.MakingAnagrams;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakingAnagramsTest {

    @DisplayName("아나그램 만들기")
    @Test
    void making_anagrams() {
        // given
        String first = "cde";
        String second = "abc";
        MakingAnagrams makingAnagrams = new MakingAnagrams();

        // when
        int result = makingAnagrams.solve(first, second);

        // then
        assertThat(result).isEqualTo(4);
    }

}
