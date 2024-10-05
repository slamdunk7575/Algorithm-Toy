package me.twoweeks.topdowndp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KnapSackTopDownDp {

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
        dp = new int[count][10];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));

        for (int i = 0; i < count; i++) {
            String[] inputArr = br.readLine().split(" ");
            int itemWeight = Integer.parseInt(inputArr[0]);
            int itemPrice = Integer.parseInt(inputArr[1]);
            items[i][0] = itemWeight;
            items[i][1] = itemPrice;
        }

        /*int maxPrice = Arrays.stream(dp)
                .flatMapToInt(Arrays::stream)
                .max()
                .orElse(0);*/
        System.out.println(recur(0, 0));
    }

    private static int recur(int idx, int itemWeight) {
        if (itemWeight > totalWeight) {
            return Integer.MIN_VALUE;
        }

        if (idx == count) {
            return 0;
        }

        if (dp[idx][itemWeight] != -1) {
            return dp[idx][itemWeight];
        }

        dp[idx][itemWeight] = Math.max(
                recur(idx + 1, itemWeight + items[idx][0]) + items[idx][1],
                recur(idx + 1, itemWeight)
        );

        return dp[idx][itemWeight];
    }
}
