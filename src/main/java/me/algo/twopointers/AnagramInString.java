package me.algo.twopointers;

import java.util.ArrayList;
import java.util.List;

/**
 * (정리)
 * 알파벳 26자리를 나타내는 배열을 이용
 * input 예: abcd 는 'a' 아스키코드 값 97(예:c=99-97)을 이용하여 [1, 1, 1, 1, 0, 0, ...] 으로 표현
 * 주어진 source 값의 0번부터 (source.length() - input.length() + 1) 까지 하나씩 옮겨가면서 알파벳화 진행
 * input 알파벳과 source 알파벳 배열 값이 일치하는지 비교
 *
 * 시간복잡도: O(N*M)
 * - 대상: String source, String input (아나그램을 비교할 문자열들)
 * - 이유: source 길이 만큼 실행(N), input 길이 만큼 실행(M)
 *
 * 공간복잡도: O(1)
 * - 대상: int[] inputAlphabets = new int[26];
 * - 이유: 알파벳 26개 고정
 */
public class AnagramInString {

    public List<Integer> solveByArray(String source, String input) {
        // Data Structure
        List<Integer> result = new ArrayList<>();
        if (source == null || source.length() == 0 || input == null || input.length() == 0) {
            return result;
        }

        // for or while
        int[] inputAlphabets = new int[26];
        for (int i = 0; i < input.length(); i++) {
            inputAlphabets[input.charAt(i) - 'a']++; // [1, 1, 1, 1, 0, 0, 0 ...]
        }

        for (int i = 0; i < source.length() - input.length() + 1; i++) {
            int[] sourceAlphabets = new int[26];
            for (int j = 0; j < input.length(); j++) {
                // 0번 ~ 3번: bacd -> [1, 1, 1, 1, 0, 0, 0 ...]
                // 1번 ~ 4번: acdg -> [1, 0, 1, 1, 0, 0, 1 ...]
                // 알파벳 배열화...
                sourceAlphabets[source.charAt(i + j) - 'a']++;
            }

            if (check(inputAlphabets, sourceAlphabets)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean check(int[] inputAlphabets, int[] sourceAlphabets) {
        for (int i = 0; i < inputAlphabets.length; i++) {
            if(inputAlphabets[i]!= sourceAlphabets[i]) {
                return false;
            }
        }
        return true;
    }

}
