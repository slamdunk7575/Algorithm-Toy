package me.algo.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EventsSortTest {

    @DisplayName("이벤트 정렬하기 (시간순 -> 시간이 같다면 1.팀 이름순, 2.회원 이름순)")
    @Test
    void events_sort() {
        // given
        String team1 = "edc";
        String team2 = "cde";
        List<String> events1 = Arrays.asList("sam 43 Y", "alex 12 G");
        List<String> events2 = Arrays.asList("robin 46 G", "kris 46 S avery");

        EventsSort eventsOrder = new EventsSort();

        // when
        List<String> result = eventsOrder.solve(team1, team2, events1, events2);

        // then
        assertThat(result).isEqualTo(Arrays.asList(
                "edc alex 12 G",
                "edc sam 43 Y",
                "cde kris 46 S avery",
                "cde robin 46 G"));
    }

}
