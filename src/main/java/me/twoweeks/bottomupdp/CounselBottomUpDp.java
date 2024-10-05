package me.twoweeks.bottomupdp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CounselBottomUpDp {

    private static int count;
    private static int[][] schedules;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());

        schedules = new int[count][2];
        dp = new int[count + 1];

        for (int i = 0; i < count; i++) {
            String[] inputArr = br.readLine().split(" ");
            int day = Integer.parseInt(inputArr[0]);
            int price = Integer.parseInt(inputArr[1]);
            schedules[i][0] = day;
            schedules[i][1] = price;
        }

        solve();

        System.out.println(dp[0]);
    }

    private static void solve() {
        for (int i = count - 1; i >= 0; i--) {
            if (i + schedules[i][0] > count) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + schedules[i][0]] + schedules[i][1], dp[i + 1]);
            }
        }
    }

    public int[] test(int count, int[][] schedules, int[] dp) {
        for (int i = count - 1; i >= 0; i--) {
            if (i + schedules[i][0] > count) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + schedules[i][0]] + schedules[i][1], dp[i + 1]);
            }
        }
        return dp;
    }
}
