package me.algo.string;

/**
 * (정리)
 * 1. '-'(대쉬) 제거하기
 * 2. 대문자로 만들기
 * 3. K 값으로 문자열 나누기
 * 4. 나눈 문자열 사이에 '-' 넣기
 *
 * 시간 복잡도: O(N)
 * - 대상: String input
 * - 이유: for문 한번 실행
 *
 * 공간 복잡도: O(N)
 * - 대상: StringBuilder sb
 * - 이유: StringBuilder 담고 for문 한번 실행
 */
public class LicenseKeyFormatting {

    public String solve(String input, int k) {

        String newInput = input.replace("-", "");
        newInput = newInput.toUpperCase();

        StringBuilder sb = new StringBuilder(newInput);
        int len = sb.length();

        for (int i = k; i < len; i = i + k) {
            sb.insert(len-i, "-");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }
}
