package me.algo.dynamic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniquePathTest {

    @DisplayName("UniquePath 테스트")
    @Test
    void unique_path_test() {
        // given
        UniquePath uniquePath = new UniquePath();
        int m = 7;
        int n = 3;

        // when
        int solve = uniquePath.solve(m, n);

        // then
        assertThat(solve).isEqualTo(28);
    }

}