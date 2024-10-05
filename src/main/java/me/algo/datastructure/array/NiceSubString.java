package me.algo.datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NiceSubString {

    public int solution(String input) {
        int result = findSubStringCount(input);
        return result;
    }

    private int findSubStringCount(String input) {
        String subText = "";
        HashSet<String> result = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                subText = input.substring(i, j + 1);
                boolean isDuplication = checkDuplication(subText);
                if (!isDuplication) {
                    System.out.println(subText);
                    result.add(subText);
                }
            }
        }
        return result.size();
    }

    private boolean checkDuplication(String subText) {
        Set<String> removedDuplication = new HashSet<>(Arrays.asList(subText.split("")));
        if (subText.length() != removedDuplication.size()) {
            return true;
        }
        return false;
    }
}
