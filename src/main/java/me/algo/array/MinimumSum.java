package me.algo.array;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MinimumSum {

    public int solve(int[] a, int[] b) {

        if (a.length == 0 || b.length == 0) {
            return -1;
        }

        int sum = 0;
        int len = a.length;

        List<Integer> aNums = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bNums = Arrays.stream(b).boxed().collect(Collectors.toList());

        for (int i = 0; i < len; i++) {
            int minNumInA = findMinValue(aNums);
            int maxNumInB = findMaxValue(bNums);

            sum += minNumInA * maxNumInB;

            aNums.remove(Integer.valueOf(minNumInA));
            bNums.remove(Integer.valueOf(maxNumInB));
        }

        return sum;
    }

    private int findMinValue(List<Integer> nums) {
        return nums.stream().mapToInt(x -> x).min().orElseThrow(() -> new NoSuchElementException());
    }

    private int findMaxValue(List<Integer> nums) {
        return nums.stream().mapToInt(x -> x).max().orElseThrow(() -> new NoSuchElementException());
    }

}
