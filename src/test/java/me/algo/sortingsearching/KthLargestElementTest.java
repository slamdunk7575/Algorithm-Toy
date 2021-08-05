package me.algo.sortingsearching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestElementTest {

    @DisplayName("K번째 제일 큰 원소")
    @Test
    void kth_largest_element_test() {
        // given
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        KthLargestElement kthLargestElement = new KthLargestElement();

        // when
        int result = kthLargestElement.solveByPriorityQueue(nums, k);

        // then
        assertThat(result).isEqualTo(4);
    }

}
