package me.algo.array;

public class MinSizeSubArray {

    public int solve(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int sum = 0;
        int result = nums.length;
        boolean isExistSubArr = false;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                isExistSubArr = true;
                System.out.println("right: " + right);
                System.out.println("left: " + left);
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
                System.out.println("sum: " + sum);
            }
        }

        if (isExistSubArr) {
            return result;
        } else {
            return 0;
        }
    }
}
