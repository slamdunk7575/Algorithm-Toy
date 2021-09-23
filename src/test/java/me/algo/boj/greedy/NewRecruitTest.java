package me.algo.boj.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NewRecruitTest {

    @DisplayName("신입사원 #1946")
    @Test
    void newRecruit() {
        // given
        int testCase = 2;
        List<List<Applicant>> cases = new ArrayList<>();

        List<Applicant> case1 = Arrays.asList(
                new Applicant(3, 6),
                new Applicant(7, 3),
                new Applicant(4, 2),
                new Applicant(1, 4),
                new Applicant(5, 7),
                new Applicant(2, 5),
                new Applicant(6, 1)
        );

        cases.add(case1);

        List<Applicant> case2 = Arrays.asList(
                new Applicant(3, 2),
                new Applicant(1, 4),
                new Applicant(4, 1),
                new Applicant(2, 3),
                new Applicant(5, 5)
        );

        cases.add(case2);

        NewRecruit newRecruit = new NewRecruit();

        // when
        List<Integer> result = newRecruit.solve(testCase, cases);

        // then
        assertThat(result).containsExactly(3, 4);
    }
}
