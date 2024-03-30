package me.algo.dfs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NearestLargeNumber {

    List<Integer> valueList;
    int m;
    int answer;
    int[] cache;
    int target;
    boolean findFlag;

    public int solution(int n) {

        valueList = Arrays.stream(String.valueOf(n)
                        .split(""))
                .sorted()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        m = valueList.size();
        cache = new int[m];
        target = n;

        dfs(0, 0);
        if (findFlag == false) {
            return -1;
        }

        return answer;
    }

    public void dfs(int level, int number) {
        if (findFlag) {
            return;
        }

        if (level == m) {
            if (number > target) {
                answer = number;
                findFlag = true;
            }
        } else {
            for (int i = 0; i < m; i++) {
                if (cache[i] == 0) {
                    cache[i] = 1;
                    dfs(level + 1, number * 10 + valueList.get(i));
                    cache[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        NearestLargeNumber nearestLargeNumber = new NearestLargeNumber();
        // System.out.println(nearestLargeNumber.solution(123));
        // System.out.println(nearestLargeNumber.solution(321));
        System.out.println(nearestLargeNumber.solution(20573));
        // System.out.println(nearestLargeNumber.solution(27711));
        // System.out.println(nearestLargeNumber.solution(54312));
    }
}
