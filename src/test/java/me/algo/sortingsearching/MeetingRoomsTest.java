package me.algo.sortingsearching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeetingRoomsTest {

    @DisplayName("MeetingRooms 테스트")
    @Test
    void meeting_rooms_test() {
        // given
        MeetingRooms meetingRooms = new MeetingRooms();

        /*Interval interval1 = new Interval(15, 20);
        Interval interval2 = new Interval(5, 10);
        Interval interval3 = new Interval(0, 30);*/

        Interval interval1 = new Interval(7, 10);
        Interval interval2 = new Interval(2, 4);

        Interval[] intervals = {interval1, interval2};

        // when
        boolean result = meetingRooms.solve(intervals);

        // then
        assertThat(result).isTrue();
    }

}
