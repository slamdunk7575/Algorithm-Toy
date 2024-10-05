package me.algo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

    public List<String> solve(String digits) {
        String[] digitLetter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combine(result, digitLetter[digits.charAt(i) - '0']);
        }

        return result;
    }

    private List<String> combine(List<String> beforeResult, String digit) {
        List<String> newResult = new ArrayList<>();

        // 1. "abc" -> ""
        // 2. "def" -> "abc"
        // 바깥쪽 for문(예: def) 에서 안쪽 for문(예: abc) 방향으로 조합을 만듦
        for (int i = 0; i < digit.length(); i++) {
            for (String before : beforeResult) {
                newResult.add(before + digit.charAt(i));
            }
        }
        return newResult;
    }
}
