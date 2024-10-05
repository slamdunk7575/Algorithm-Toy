package me.algo.sorting;

import java.util.*;

public class MeetingRooms2 {

    public int solve(Interval[] intervals) {
        // 예외처리
        if (Objects.isNull(intervals) || intervals.length == 0) {
            return 0;
        }

        // start 타임으로 정렬
        Arrays.sort(intervals, (Interval a, Interval b) -> a.start - b.start);

        // PriorityQueue MinHeap (end 타임 회의 끝 시간)
        Queue<Interval> priorityQueue = new PriorityQueue<>((Interval a, Interval b) -> a.end - b.end);
        priorityQueue.offer(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            Interval peekInterval = priorityQueue.peek();

            // 앞.end <= 뒷.start 인 경우 회의실 필요 없음 (= 회의실 합침)
            if (peekInterval.end <= intervals[i].start) {
                priorityQueue.poll();
            }

            priorityQueue.offer(intervals[i]);
        }

        return priorityQueue.size();
    }

}
