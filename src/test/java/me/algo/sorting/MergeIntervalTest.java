package me.algo.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeIntervalTest {

    @DisplayName("Interval 병합하기")
    @Test
    void merge_interval_test() {
        // given
        int[][] intervals = {
                {1, 4},
                {8, 10},
                {2, 6},
                {12, 18},
        };

        MergeInterval mergeInterval = new MergeInterval();

        // when
        int[][] results = mergeInterval.solve(intervals);

        // then
        assertThat(results).containsExactly(new int[][]{{1, 6}, {8, 10}, {12, 18}});
    }
}
