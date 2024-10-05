package me.boj.greedy;

import me.boj.greedy.SugarDelivery;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SugarDeliveryTest {

    @DisplayName("설탕 배달 #2839")
    @Test
    void sugarDelivery() {
        // given
        int input = 11;
        SugarDelivery sugarDelivery = new SugarDelivery();

        // when
        int result = sugarDelivery.solve(input);

        // then
        assertThat(result).isEqualTo(3);
    }

}
