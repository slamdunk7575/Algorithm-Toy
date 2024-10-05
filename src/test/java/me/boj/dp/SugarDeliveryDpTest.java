package me.boj.dp;

import me.boj.dp.SugarDeliveryDp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SugarDeliveryDpTest {

    @DisplayName("설탕 배달")
    @Test
    void sugarDeliveryDp() {
        // given
        int[] bags = {3, 5};
        int amount = 11;
        SugarDeliveryDp sugarDeliveryDp = new SugarDeliveryDp();

        // when
        int result = sugarDeliveryDp.solve(bags, amount);

        // then
        assertThat(result).isEqualTo(3);
    }

}
