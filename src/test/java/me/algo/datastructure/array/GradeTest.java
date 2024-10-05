package me.algo.datastructure.array;

import me.algo.datastructure.array.Grade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GradeTest {

    @DisplayName("학점")
    @Test
    void grade() {
        // given
        int[][] scores =  {
            { 100, 90, 98, 86, 65 },
            { 50, 43, 99, 85, 77 },
            { 47, 88, 96, 80, 68 },
            { 61, 56, 100, 80, 65 },
            { 27, 90, 94, 75, 63 },
        };

        Grade grade = new Grade();

        // when
        String result = grade.solution(scores);

        // then
        assertThat(result).isEqualTo("FBABD");
    }
}
