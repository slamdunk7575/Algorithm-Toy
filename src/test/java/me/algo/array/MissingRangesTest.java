package me.algo.array;

import me.algo.datastructure.array.MissingRanges;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MissingRangesTest {

    @DisplayName("누락된 범위 찾기")
    @Test
    void missing_rages() {
        // given
        int lower = 0;
        int upper = 99;
        int[] nums = { 2, 3, 5, 50, 75 };

        MissingRanges missingRanges = new MissingRanges();

        // when
        List<String> result = missingRanges.solve(nums, lower, upper);
        System.out.println(result);

        // then
        assertThat(result).containsAll(Arrays.asList("0->1", "4", "6->49", "51->74", "76->99"));
    }

}
