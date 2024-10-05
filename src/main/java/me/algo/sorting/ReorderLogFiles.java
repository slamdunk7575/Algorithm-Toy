package me.algo.sorting;

import java.util.Arrays;

/**
 * (정리)
 *
 * 시간복잡도: O(M*N*log N)
 * - 대상: String[] logs
 * - 이유: 소팅하는 부분 O(N*log N)
 * logs의 length() M만큼 있음 O(M)
 *
 * 공간복잡도: O(M*log N)
 * - 이유: logs의 길이 M만큼 저장공간 필요 O(M)
 * 소팅하는 부분 O(log N)
 */
public class ReorderLogFiles {

    public String[] solve(String[] logs) {

        Arrays.sort(logs, (log1, log2) -> {
            String[] logs1 = log1.split(" ", 2);
            String[] logs2 = log2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(logs1[1].charAt(0));
            boolean isDigit2= Character.isDigit(logs2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                // 모두 문자인 경우
                int comp = logs1[1].compareTo(logs2[1]);
                if (comp == 0) {
                    return logs1[0].compareTo(logs2[0]);
                }
                return comp;
            } else if (isDigit1 && isDigit2) {
                // 모두 숫자인 경우
                return 0;
            } else if (isDigit1 && !isDigit2) {
                // 첫번째 숫자, 두번째 문자 (자리 변경)
                return 1;
            } else {
                // 첫번째 문자, 두번째 숫자 (오름차순)
                return -1;
            }

        });

        return logs;
    }
}
