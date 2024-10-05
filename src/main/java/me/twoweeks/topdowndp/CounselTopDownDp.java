package me.twoweeks.topdowndp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CounselTopDownDp {

    private static int count;
    private static int[][] schedules;
    private static int answer = 0;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());

        schedules = new int[count][2];
        dp = new int[count + 1];
        dp = Arrays.stream(dp).map(value -> -1).toArray();

        for (int i = 0; i < count; i++) {
            String[] inputArr = br.readLine().split(" ");
            int day = Integer.parseInt(inputArr[0]);
            int price = Integer.parseInt(inputArr[1]);
            schedules[i][0] = day;
            schedules[i][1] = price;
        }

        recur(0);
        int maxPrice = Arrays.stream(dp).max().getAsInt();
        System.out.println(maxPrice);
    }

    private static int recur(int idx) {
        if (idx == count - 1) {
            return 0;
        }

        if (idx > count - 1) {
            return Integer.MIN_VALUE;
        }

        // 재사용
        if (dp[idx] != -1) {
            return dp[idx];
        }

        // 상담을 받거나 안받거나 그중에서 더 많은 돈을 버는 경우, DP 테이블에 저장
        dp[idx] = Math.max(
                recur(idx + schedules[idx][0]) + schedules[idx][1],
                recur(idx + 1)
        );

        return dp[idx];
    }
}
