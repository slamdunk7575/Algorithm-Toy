package me.twoweeks.dfsbfs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VirusDfsTest {

    @Test
    void virus_dfs() {
        // given
        int count = 7;
        int graphCount = 6;
        int[][] graph = {
                { 1, 2 },
                { 2, 3 },
                { 1, 5 },
                { 5, 2 },
                { 5, 6 },
                { 4, 7 },
        };

        // when
        VirusDfs virusDfs = new VirusDfs();
        int result = virusDfs.solve(count, graphCount, graph);

        // then
        assertThat(result).isEqualTo(4);
    }

}
