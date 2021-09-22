package me.algo.boj.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinTest {

    @DisplayName("동전 #11047")
    @Test
    void coin() {
        // given
        int n = 10;
        int k = 4200;
        int[] coins = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 };

        Coin coin = new Coin();

        // when
        int result = coin.solve(n, k, coins);

        // then
        assertThat(result).isEqualTo(6);
    }
}
