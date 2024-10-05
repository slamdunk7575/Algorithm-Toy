package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewClusteringTest {

    @DisplayName("뉴스 클러스터링")
    @Test
    void newClustering() {
        // given
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        NewClustering newClustering = new NewClustering();

        // when
        int result = newClustering.solve(str1, str2);

        // then
        assertThat(result).isEqualTo(43690);
    }

}
