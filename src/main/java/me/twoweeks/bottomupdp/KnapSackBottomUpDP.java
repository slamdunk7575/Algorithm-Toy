package me.twoweeks.bottomupdp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KnapSackBottomUpDP {

    private static int count;
    private static int totalWeight;
    private static int[][] items;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        count = Integer.parseInt(st.nextToken());
        totalWeight = Integer.parseInt(st.nextToken());

        items = new int[count][2];
        dp = new int[count][1000]; // 무게: 1000 까지
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));

        for (int i = 0; i < count; i++) {
            String[] inputArr = br.readLine().split(" ");
            int itemWeight = Integer.parseInt(inputArr[0]);
            int itemPrice = Integer.parseInt(inputArr[1]);
            items[i][0] = itemWeight;
            items[i][1] = itemPrice;
        }

        solve();

        System.out.println(dp[count - 1][totalWeight]);
    }

    private static void solve() {
        for (int idx = 1; idx < count; idx++) {
            for (int itemWeight = 0; itemWeight < totalWeight + 1; itemWeight++) {
                if (itemWeight < totalWeight) {
                    dp[idx][itemWeight] = dp[idx - 1][itemWeight];

                } else {
                    dp[idx][itemWeight] = Math.max(
                            dp[idx - 1][itemWeight - items[idx][0]] + items[idx][1],
                            dp[idx - 1][itemWeight]
                    );
                }
            }
        }
    }

    public int[][] test(int count, int totalWeight, int[][] items, int[][] dp) {

        for (int idx = 1; idx < count + 1; idx++) {
            for (int weight = 1; weight < totalWeight + 1; weight++) {
                if (weight < items[idx - 1][0]) {
                    dp[idx][weight] = dp[idx - 1][weight];

                } else {
                    dp[idx][weight] = Math.max(
                            dp[idx - 1][weight - items[idx - 1][0]] + items[idx - 1][1],
                            dp[idx - 1][weight]
                    );
                }
            }
        }

        return dp;
    }

}
