package me.algo.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * (정리)
 * 1. 정수 배열 nums와 정수 k가 주어지면 배열에서 k번째로 큰 요소를 반환
 * 2. k 번째로 큰 요소는 값에 대해 가장 큰 요소를 반환하는 것이 아니라 순서 요소를 반환
 *
 * 시간 복잡도: O(Nlogk)
 * 대상: int[] nums, int k
 * 이유: 배열의 갯수 n * 우선순위 큐 logk
 *
 * 공간 복잡도: O(k)
 * 이유: 우선순위 큐 minHeap에서 최상단 k개 만큼만 유지하기 때문
 */
public class KthLargestElement {

    public int solveByPriorityQueue(int[] nums, int k) {

        Queue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    // 정렬 이용
    public int solve(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
