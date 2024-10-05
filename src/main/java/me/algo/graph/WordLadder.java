package me.algo.graph;

import java.util.*;

public class WordLadder {

    public int solve(String beginWord, String endWord, List<String> words) {

        if (words == null || !words.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> dictionary = new HashSet<>(words);
        queue.offer(beginWord);

        dictionary.add(endWord);
        dictionary.remove(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                queue.stream().forEach(str -> {System.out.println(str);});
                System.out.println("--------------");

                String word = queue.poll();
                if (word.equals(endWord)) {
                    return level;
                }

                for (String neighbor : neighbors(word, words)) {
                    queue.offer(neighbor);
                }
            }
            level++;
        }

        return 0;
    }

    private List<String> neighbors(String word, List<String> words) {
        List<String> result = new LinkedList<>();
        Set<String> dictionary = new HashSet<>(words);

        for (int i = 0; i < word.length(); i++) {
            char[] chars = word.toCharArray();
            for (char ch = 'a'; ch < 'z'; ch++) {
                chars[i] = ch;
                String wordStr = new String(chars);
                if (dictionary.remove(wordStr)) {
                    result.add(wordStr);
                }
            }
        }

        return result;
    }
}
