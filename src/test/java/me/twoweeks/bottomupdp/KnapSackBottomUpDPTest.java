package me.twoweeks.bottomupdp;

import me.twoweeks.bottomupdp.KnapSackBottomUpDP;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KnapSackBottomUpDPTest {

    @Test
    void knap_sack_bottom_up_dp() {
        // given
        int count = 4;
        int totalWeight = 7;

        int[][] items = {{6, 13}, {4, 8}, {3, 6}, {5, 12}};
        int[][] dp = new int[count + 1][10];

        // when
        KnapSackBottomUpDP knapSackBottomUpDP = new KnapSackBottomUpDP();
        int[][] result = knapSackBottomUpDP.test(count, totalWeight, items, dp);

        // then
        assertThat(result[count][totalWeight]).isEqualTo(14);
    }

}
