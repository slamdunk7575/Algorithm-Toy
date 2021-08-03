package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeetingRooms2Test {

    @DisplayName("MeetingRooms2 테스트")
    @Test
    void meeting_rooms_2_test() {
        // given
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();

        Interval interval1 = new Interval(4, 9);
        Interval interval2 = new Interval(5, 15);
        Interval interval3 = new Interval(0, 30);
        Interval interval4 = new Interval(10, 16);

        // when
        Interval[] intervals = { interval1, interval2, interval3, interval4 };

        // then
        assertThat(meetingRooms2.solve(intervals)).isEqualTo(3);
    }

}
