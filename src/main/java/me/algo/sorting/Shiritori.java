package me.algo.sorting;

import java.util.ArrayList;
import java.util.List;

public class Shiritori {

    public int[] solution(int n, String[] words) {
        int[] result = new int[2];
        List<String> wordBasket = new ArrayList<>();
        boolean canGameRunning = true;

        for (int i = 0; i < words.length; i++) {
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)
                    || wordBasket.contains(words[i])) {
                result[0] = (i % n) + 1;
                result[1] = (i / n) + 1;
                canGameRunning = false;
                break;
            }

            wordBasket.add(words[i]);
        }

        if (canGameRunning) {
            return new int[]{0, 0};
        }

        return result;
    }
}
