package me.algo.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static me.algo.util.PrintUtil.print;
import static org.assertj.core.api.Assertions.assertThat;

class ClosestPointTest {

    @DisplayName("원점에서 가장 가까운 지점 테스트")
    @Test
    void closest_point_test() {
        // given
        /*int[][] points = { {1, 3}, {-2, 2} };
        int k = 1;*/
        int[][] points = { {3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        ClosestPoint closestPoint = new ClosestPoint();

        // when
        int[][] result = closestPoint.solve(points, k);
        print(result);

        // then
        // assertThat(result).containsExactly(new int[]{-2, 2});
        assertThat(result).containsExactly(new int[][]{{-2, 4}, {3, 3}});

    }

}
