package me.algo.array;

import java.util.ArrayList;
import java.util.List;

/**
 * (정리)
 *
 * 시간복잡도: O(N)
 * - 대상: int[] nums
 * - 이유: nums 배열의 크기 n만큼 for문 실행
 *
 * 공간복잡도: O(N)
 * - 대상: List<String> result = new ArrayList<>();
 * - 이유: 리스트 만들어서 for문 실행
 */
public class MissingRanges {

    public List<String> solve(int[] nums, int lower, int upper) {
        // Data Structure
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        // 예: 0 - 1
        if (lower < nums[0]) {
            result.add(makeRange(lower, nums[0] - 1));
        }

        // 예: 6 - 49
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1] && nums[i] + 1 < nums[i + 1]) {
                result.add(makeRange(nums[i] + 1, nums[i + 1] - 1));
            }
        }

        // 예: 76 - 99
        if (nums[nums.length - 1] < upper) {
            result.add(makeRange(nums[nums.length - 1] + 1, upper));
        }

        return result;
    }

    private String makeRange(int low, int high) {
        return low == high ? String.valueOf(low) : (low + "->" + high);
    }
}
