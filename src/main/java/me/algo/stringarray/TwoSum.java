package me.algo.stringarray;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solve(int[] nums, int target) {
        // 1. 담을 그릇 정하기
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        // 2. for 문
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) { // 14
                int value = map.get(nums[i]); // 0
                result[0] = value + 1;
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }

        }

        return result;
    }
}
