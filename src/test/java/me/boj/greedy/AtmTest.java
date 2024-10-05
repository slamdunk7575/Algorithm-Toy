package me.boj.greedy;

import me.boj.greedy.Atm;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AtmTest {

    @DisplayName("ATM #11399")
    @Test
    void atm() {
        // given
        int n = 5;
        int[] p = { 3, 1, 4, 3, 2 };
        Atm atm = new Atm();

        // when
        int result = atm.solve(n, p);

        // then
        assertThat(result).isEqualTo(32);
    }

}
