package me.algo.stringarray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeros {

    public void solve(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
                System.out.println("index: " + index);
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        // Arrays.stream(nums).forEach(num -> System.out.println(num));
        String result = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
