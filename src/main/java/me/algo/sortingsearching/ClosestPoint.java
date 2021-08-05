package me.algo.sortingsearching;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * (정리)
 * 1.
 *
 * 시간복잡도: O(NlogN)
 * - 대상: int[][] points
 * - 이유: 이차원 배열의 갯수 n * 우선순위 큐 logN
 *
 * 공간복잡도: O(k)
 * - 대상: 새로운 결과 저장공간 (int[][] result = new int[k][2])
 * - 이유: 우선순위 큐 maxHeap에서 최상단 k개 만큼만 유지하기 때문
 */
public class ClosestPoint {

    public int[][] solve(int[][] points, int k) {
        // Data Structure
        Queue<int[]> pq = new PriorityQueue<>((b, a) ->
                (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // 결과
        int[][] result = new int[k][2];

        int index = 0;
        while (index < k) {
            result[index] = pq.poll();
            index++;
        }

        return result;
    }
}
