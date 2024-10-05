package me.algo.array;

import me.algo.datastructure.array.GroupAnagrams;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    @DisplayName("그룹 아나그램")
    @Test
    void group_anagrams() {
        // given
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        // when
        // List<List<String>> result = groupAnagrams.solveBySort(words);
        List<List<String>> result = groupAnagrams.solveByASCII(words);

        System.out.println(result);

        // then
        List<List<String>> expectedResult = new ArrayList<>();
        expectedResult.add(Arrays.asList("bat"));
        expectedResult.add(Arrays.asList("tan", "nat"));
        expectedResult.add(Arrays.asList("eat", "tea", "ate"));
        assertThat(result).containsAll(expectedResult);
    }

}
