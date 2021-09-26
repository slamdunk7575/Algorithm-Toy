package me.algo.dynamic;

/**
 * (정리)
 * DP 는 추상적으로 상상하지 말고 직접 구체적인 예를 만들어 풀어야함
 *
 * 예:
 * nums [1, 2, 1, 4, 3, 3]
 * dp   [1, 2, 1, 1, 0, 0]
 *
 * 이때 dp[3] 값은 이전 값(1, 2, 1)들을 for 루프를 돌면서 +1을 더하고
 * 가장 큰 Math.max() 값을 찾아 넣는다
 *
 * 시간복잡도: O(N*2)
 * - 대상: int[] nums
 * - 이유: for문 두번 실행
 *
 * 공간복잡도: O(N)
 * - 대상: int[] dp = new int[n];
 * - 이유: 추가적인 공간 사용
 */
public class LongestSubSequence {

    public int solve(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = 1;

        for (int i = 1; i < len; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }
}
