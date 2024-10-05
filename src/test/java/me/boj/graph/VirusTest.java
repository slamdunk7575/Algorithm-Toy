package me.boj.graph;

import me.boj.graph.Virus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VirusTest {

    @DisplayName("바이러스 #2602")
    @Test
    void virus() {
        // given
        int infectedComputer = 1;
        int computerCount = 7;

        int[][] networks = {
                {1, 2},
                {2, 3},
                {1, 5},
                {5, 2},
                {5, 6},
                {4, 7},
        };

        Virus virus = new Virus();

        // when
        int result = virus.solve(infectedComputer, computerCount,  networks);

        // then
        assertThat(result).isEqualTo(4);
    }
}
