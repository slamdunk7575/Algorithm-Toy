package me.boj.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Microwave {

    private List<Integer> times = Arrays.asList(5 * 60, 1 * 60, 10);

    public List<Integer> solve(int input) {

        List<Integer> result = new ArrayList<>();

        for (int time : times) {
            result.add(input / time);
            input = input % time;
        }

        return result;
    }
}
