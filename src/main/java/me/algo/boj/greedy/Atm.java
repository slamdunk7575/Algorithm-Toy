package me.algo.boj.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Atm {

    public int solve(int n, int[] p) {

        Arrays.sort(p);

        int accumulation = 0;
        List<Integer> minutes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int min = p[i];
            accumulation += min;
            minutes.add(accumulation);
        }

        Integer totalMinute = minutes.stream()
                .reduce(0, (a, b) -> a + b);

        return totalMinute;
    }
}
