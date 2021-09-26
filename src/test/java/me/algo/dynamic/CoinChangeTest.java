package me.algo.dynamic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinChangeTest {

    @DisplayName("Coin Change")
    @Test
    void coinChange() {
        // given
        int[] coins = {1, 2, 5};
        int amount = Integer.MAX_VALUE;
        CoinChange coinChange = new CoinChange();

        // when
        int result = coinChange.solve(coins, amount);

        // then
        assertThat(result).isEqualTo(3);
    }

}
