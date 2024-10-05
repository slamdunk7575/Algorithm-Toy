package me.algo.datastructure.array;

import java.util.Arrays;

public class MostUsedAlphabet {

    public String solution(String input) {
        char[] texts = input.toLowerCase().toCharArray();
        int[] counts = new int[26]; // a-z 까지 확인용

        for (char text : texts) {
            counts[text - 'a']++;
        }

        int maxCount = findMaxCount(counts);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            int currentCount = counts[i];
            if (currentCount == maxCount) {
                result.append(Character.toString(97 + i));
            }
        }

        return result.toString();
    }

    private int findMaxCount(int[] count) {
        return Arrays.stream(count)
                .max()
                .getAsInt();
    }
}
