package me.algo.queuestack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class HyphenReformat {

    private static final String HYPHEN = "-";

    public String solution(String input) {
        String onlyNum = input.replaceAll("-|\\s", "");

        Queue<String> nums = new LinkedList<>();

        Character[] numChars = onlyNum.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        Arrays.stream(numChars).map(String::valueOf)
                .collect(Collectors.toCollection(() -> nums));

        StringBuilder result = new StringBuilder();

        int count = 0;
        while (!nums.isEmpty()) {
            if (count != 3) {
                String num = nums.poll();
                result.append(num);
                count++;
            } else {
                result.append(HYPHEN);
                count = 0;
            }
        }

        return result.toString();
    }
}
