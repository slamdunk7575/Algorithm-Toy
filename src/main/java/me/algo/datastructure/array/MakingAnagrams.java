package me.algo.datastructure.array;

public class MakingAnagrams {

    public int solve(String first, String second) {
        int count = 0;
        int [] alphabet = new int[26];

        char[] firstChars = first.toCharArray();
        for (char c : firstChars) {
            alphabet[c - 'a']++;
        }

        char[] secondChars = second.toCharArray();
        for (char c : secondChars) {
            alphabet[c - 'a']--;
        }

        // 예: [-1, -1, 0, 1, 1, 0, 0, 0, 0, 0, 0 ...]
        for (int num : alphabet) {
            count += Math.abs(num);
        }

        return count;
    }
}
