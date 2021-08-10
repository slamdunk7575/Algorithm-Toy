package me.algo.sortingsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (정리)
 *
 * 시간복잡도: O(NlogN)
 * - 대상: int[][] intervals
 * - 이유: Arrays.sort() 사용 logN, N개의 요소들 for문 한번 실행
 *
 * 공간복잡도: O(longN) 또는 O(N)
 * - 대상: List<int[]> res = new ArrayList<>();
 * - 이유: int[][] intervals 자체를 이용하면 O(1) 이지만
 * res를 만들어 그대로 저장하면 O(N), interval 숫자가 모두 겹치는 경우엔 O(logN)
 *
 */
public class MergeInterval {

    public int[][] solve(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) {
            return res.toArray(new int[0][]);
        }

        // Data Structure
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        /* start 값으로 오름차순 정렬
        {1, 4},
        {2, 6},
        {8, 10},
        {12, 18},*/

        // for or while
        // start=1, end=4
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            // 전.end >= 현.start 경우
            if (end >= intervals[i][0]) {
                // end 값을 바꿈
                end = Math.max(end, intervals[i][1]);
            } else {
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        res.add(new int[]{start, end}); // 마지막 저장 (15, 18)

        return res.toArray(new int[res.size()][]);
        // (또는) return res.toArray(new int[0][]);
    }
}
