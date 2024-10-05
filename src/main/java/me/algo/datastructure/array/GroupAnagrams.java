package me.algo.datastructure.array;

import java.util.*;

/**
 * (정리)
 *
 * 시간복잡도: O(NKlogK)
 * - 대상: String[] texts
 * - 이유: texts 배열의 크기 N개, text의 length() K개, 소팅 실행 logK
 *
 * 공간복잡도: O(NK)
 * - 대상: Map<String, List<String>> checks = new HashMap<>()
 * - 이유: texts 배열의 크기 N개, text 갯수 K개
 */
public class GroupAnagrams {

    // Sort 이용한 방법
    public List<List<String>> solveBySort(String[] texts) {
        List<List<String>> result = new ArrayList<>();

        if (texts == null || texts.length == 0) {
            return result;
        }

        Map<String, List<String>> checks = new HashMap<>();

        for (String text : texts) {
            // 문자 정렬
            char[] chars = text.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            /*if (checks.containsKey(key)) {
                checks.get(key).add(text);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(text);
                checks.put(key, anagrams);
            }*/

            List<String> anagrams = checks.getOrDefault(key, new ArrayList<>());
            anagrams.add(text);
            checks.put(key, anagrams);
        }

        // result.addAll(checks.values());
        for (Map.Entry<String, List<String>> entry : checks.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }


    // 아스키코드(ASCII) 이용한 방법
    public List<List<String>> solveByASCII(String[] texts) {
        Map<String, List<String>> checks = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String text : texts) {
            int[] count = new int[26]; // a-z 까지 확인용

            for (int i = 0; i < text.length(); i++) {
                count[text.charAt(i) - 'a']++; // [1, 0, 0, 0, 1, ... 1...]
            }

            String key = Arrays.toString(count);
            System.out.println("hash: " + key);

            List<String> anagrams = checks.getOrDefault(key, new ArrayList<>());
            anagrams.add(text);
            checks.put(key, anagrams);
        }

        for (Map.Entry<String, List<String>> entry : checks.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
