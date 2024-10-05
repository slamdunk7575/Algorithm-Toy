package me.boj.greedy;

import me.boj.greedy.Change;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChangeTest {

    @DisplayName("거스름돈 #5585")
    @Test
    void change() {
        // given
        int money = 380;
        Change change = new Change();

        // when
        int result = change.solve(money);

        // then
        assertThat(result).isEqualTo(4);
    }
}
