package me.algo.twopointers;

import java.util.HashMap;
import java.util.Map;

/**
 * (정리)
 * 시간복잡도: O(N)
 * - 대상: String words
 * - 이유: 입력 words 길이만큼 실행
 *
 * 공간복잡도: O(N)
 * - 대상: Map<Character, Integer> counts = new HashMap<>();
 * - 이유: words의 단어를 하나씩 key로 저장
 */
public class LongestSubWithoutRepeatChar {

    public int solve(String words) {
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int right = 0;
        int duplication = 0;
        int max = 0;

        // right 포인터를 이동
        while (right < words.length()) {
            char wordByRight = words.charAt(right);
            counts.put(wordByRight, counts.getOrDefault(wordByRight, 0) + 1);
            // 단어 중복 체크
            if (counts.get(wordByRight) > 1) {
                duplication++;
            }
            right++;

            // 중복된 단어가 발견된 경우 left 포인터가 중복이 발생한 단어 전까지 0으로 초기화함
            // 예: p -> 1개, a -> 1개, w -> 2개 카운터를 0으로 초기화
            while (duplication > 0) {
                char wordByLeft = words.charAt(left);
                if (counts.get(wordByLeft) > 1) {
                    duplication--;
                }
                counts.put(wordByLeft, counts.get(wordByLeft) - 1);
                left++;
            }

            max = Math.max(max, right - left);
        }

        return max;
    }
}
