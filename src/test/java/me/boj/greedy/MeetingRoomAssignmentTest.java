package me.boj.greedy;

import me.boj.greedy.Interval;
import me.boj.greedy.MeetingRoomAssignment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MeetingRoomAssignmentTest {

    @DisplayName("회의실 배정 #1931")
    @Test
    void meetingRoomAssignment () {
        // given
        int n = 11;
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 4),
                new Interval(3, 5),
                new Interval(0, 6),
                new Interval(5, 7),
                new Interval(3, 8),
                new Interval(5, 9),
                new Interval(6, 10),
                new Interval(8, 11),
                new Interval(8, 12),
                new Interval(2, 13),
                new Interval(12, 14)
        );

        MeetingRoomAssignment mra = new MeetingRoomAssignment();

        // when
        int result = mra.solve(n, intervals);

        // then
        assertThat(result).isEqualTo(4);
    }
}
