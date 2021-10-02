package me.algo.queuestack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StockPriceTest {

    @DisplayName("주식가격")
    @Test
    void stockPrice() {
        // given
        int[] prices = {1, 2, 3, 2, 3};
        StockPrice stockPrice = new StockPrice();

        // when
        int[] result = stockPrice.solve(prices);

        // then
        assertThat(result).containsExactly(4, 3, 1, 1, 0);
    }

}
