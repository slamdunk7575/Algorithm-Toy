package me.algo.twopointers;

import java.util.HashMap;
import java.util.Map;

/**
 * (정리)
 *
 * 시간복잡도: O(N)
 * - 대상: String words
 * - 이유: words의 길이만큼 실행
 *
 * 공간복잡도: O(1)
 * - 대상: Map<Character, Integer> counts = new HashMap<>()
 * - 이유: key를 3개만 저장
 */
public class LongestSubMostTwoDistinct {

    public int solve(String words) {
        // Data Structure
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int max = 0;

        // for or while
        while (right < words.length()) {
            char wordByRight = words.charAt(right);
            counts.put(wordByRight, counts.getOrDefault(wordByRight, 0) + 1);

            // 단어 중복 체크
            if (counts.get(wordByRight) == 1) {
                count++;
            }
            // right 포인터 이동
            right++;

            // 문자가 2개 이상 쌓인 경우(=새로운 문자를 만난 경우)
            // left 포인터를 이동시키면서 Map 에서 하나씩 줄여나감
            while (count > 2) {
                char wordByLeft = words.charAt(left);
                words.charAt(left);
                counts.put(wordByLeft, counts.get(wordByLeft) - 1);

                if (counts.get(wordByLeft) == 0) {
                    count--;
                }
                // left 포인터 이동
                left++;
            }

            max = Math.max(max, right - left);
            System.out.println("right: " + right + " left: " + (right - left));
        }

        return max;
    }
}
