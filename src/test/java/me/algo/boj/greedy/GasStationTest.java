package me.algo.boj.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GasStationTest {

    @DisplayName("주유소 #13305")
    @Test
    void gasStation() {
        // given
        int city = 4;
        int[] distances = { 2, 3, 1 };
        int[] prices = { 5, 2, 4, 1 };

        GasStation gasStation = new GasStation();

        // when
        int result = gasStation.solve(city, distances, prices);

        // then
        assertThat(result).isEqualTo(18);
    }

}
