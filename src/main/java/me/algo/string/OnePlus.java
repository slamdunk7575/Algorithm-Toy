package me.algo.string;

/**
 * (정리)
 * 1. 뒷자리 부터 '1' 을 더한다.
 * 2. 값이 10이 되면 carry = 1로 1을 맨앞에 추가한다.
 *
 * 시간 복잡도: O(N)
 * - 대상: int[] digits
 * - 이유: for문 한번 실행
 *
 * 공간 복잡도: O(N)
 * - 대상: int[] digits
 * - 이유: digits 안에서 실행
 */
public class OnePlus {

    public int[] solve(int[] digits) {
        int len = digits.length;

        for (int i = len-1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[len + 1];
        result[0] = 1;

        return result;
    }
}
