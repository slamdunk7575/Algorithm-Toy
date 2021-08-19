package me.algo.backtracking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationTest {

    @DisplayName("순열 (퍼뜨리기)")
    @Test
    void permutation() {
        // given
        int[] nums = {1, 2, 3};
        Permutation permutation = new Permutation();

        // when
        List<List<Integer>> result = permutation.solve(nums);
        System.out.println(result);

        // then
        assertThat(result).contains(Arrays.asList(1, 2, 3));
    }

}
