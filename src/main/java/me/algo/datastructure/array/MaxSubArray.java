package me.algo.datastructure.array;

/**
 * (정리)
 * 시간복잡도: O(n)
 * - 대상: int[] nums
 * - 이유: nums를 for문을 돌려서 실행
 *
 * 공간복잡도: O(1)
 * - 대상: curMax, allMax
 * - 이유: curMax, allMax 상수 외에 다른 저장공간 사용안함
 */
public class MaxSubArray {

    public int solve(int[] nums) {
        int curMax = nums[0];
        int allMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            System.out.println("nums[" + i + "]: " + nums[i] + ", nums[" + i + "]+curMax: " + (nums[i] + curMax));

            curMax = Math.max(nums[i], nums[i] + curMax);
            allMax = Math.max(allMax, curMax);

            System.out.println("curMax: " + curMax + ", allMax: " + allMax);
        }

        return allMax;
    }
}
