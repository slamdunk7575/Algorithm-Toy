package me.algo.backtracking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubsetsTest {

    @DisplayName("Subsets(부분집합)")
    @Test
    void subsets() {
        // given
        int[] nums = {1, 2, 3};
        Subsets subsets = new Subsets();

        // when
        List<List<Integer>> result = subsets.solve(nums);
        System.out.println(result);

        // then
        assertThat(result).contains(Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(2, 3),
                Arrays.asList(1, 2, 3));
    }

}
