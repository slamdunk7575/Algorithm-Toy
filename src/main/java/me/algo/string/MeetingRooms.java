package me.algo.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class MeetingRooms {

    public boolean solve(Interval[] intervals) {

        if (Objects.isNull(intervals)) {
            return false;
        }

        Arrays.sort(intervals, comparator);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1].end > intervals[i].start) {
                return false;
            }
        }

        return true;
    }

    Comparator<Interval> comparator = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            // start 기준 오름차순
            return o1.start - o2.start;
        }
    };

}

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end =0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}
