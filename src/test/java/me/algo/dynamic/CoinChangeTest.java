package me.algo.dynamic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * (정리)
 *                   11
 *          /        |         \
 *        10         9          6
 *     /  |  \    /  |  \    /  |  \
 *   9    8   5  8   7   4  5   4   1
 *                            / | \   \
 *                           3  2  X   0
 *
 *  11(Amount)를 만들기 위해 주어진 [1, 2, 5](Coins)를 사용하면 [10, 9, 6] 의 숫자가 먼저 필요함
 *  다시 [10, 9, 6] 은 [1, 2, 5]를 이용하여 여러 숫자로 나눠진다
 *
 *  (예: 0 -> 1 -> 6 -> 11) 은
 *  0 -> 1 : (1코인 x 1개)
 *  1 -> 6 : (5코인 x 1개)
 *  6 -> 11 : (5코인 x 1개)
 *  을 의미한다
 *
 *  dp[] 각 자리 수는 해당 숫자를 만들기 위해 필요한 coins[1, 2, 5] 갯수를 의미하고
 *  이전 값을 이용하여 현재값을 구할 수 있다 -> 다이나믹 프로그래밍
 *
 *  dp[] 초기화시 처음 0은 시작을 의미하고
 *  전부 12로 셋팅한 이유는 비교를 위해서 넣은 값이다 (Integer.MAX_VALUE 를 넣어도 됨)
 */
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
