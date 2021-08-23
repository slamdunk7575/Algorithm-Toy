package me.algo.array;

/**
 * (정리)
 *
 * 시간복잡도: O(N)
 * - 대상: int[] height
 * - 이유: height 배열의 크기 n만큼 for문 실행
 *
 * 공간복잡도: O(N) -> O(1) (배열을 만들지 않고 다중 for문 안에서 left, right 값을 구하면 공간복잡도를 줄일 수 있다.)
 * - 대상: int[] left, int[] right
 * - 이유: 배열(left, right)을 만들어서 for문 실행
 */
public class TrappingRainWater {

    public int solve(int[] height) {
        int result = 0;
        if (height == null || height.length <= 2) {
            return result;
        }

        int len = height.length;

        // 1. leftMax[]
        int[] left = new int[len];

        int max = height[0];
        left[0] = height[0];

        for (int i = 1; i < len; i++) {
            if (height[i] < max) {
                left[i] = max;
            } else {
                left[i] = height[i];
                max = height[i];
            }
        }
        // print(left);

        // 2. rightMax[]
        int[] right = new int[len];
        max = height[len - 1];
        right[len - 1] = height[len - 1];

        for (int i = len-2; i >= 0 ; i--) {
            if (height[i] < max) {
                right[i] = max;
            } else {
                right[i] = height[i];
                max = height[i];
            }
        }
        // print(right);

        // 3. min() - height
        for (int i = 0; i < len; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }

        return result;
    }

    private void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("순서: " + i + " 값: " + arr[i]);
        }
    }
}
