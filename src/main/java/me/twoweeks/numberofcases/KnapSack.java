package me.twoweeks.numberofcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KnapSack {

    private static int count;
    private static int totalWeight;
    private static int[][] items;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        count = Integer.parseInt(st.nextToken());
        totalWeight = Integer.parseInt(st.nextToken());

        items = new int[count][2];

        for (int i = 0; i < count; i++) {
            String[] inputArr = br.readLine().split(" ");
            int itemCount = Integer.parseInt(inputArr[0]);
            int itemPrice = Integer.parseInt(inputArr[1]);
            items[i][0] = itemCount;
            items[i][1] = itemPrice;
        }

        recur(0, 0, 0);
        System.out.println(answer);
    }

    private static void recur(int idx, int itemWeight, int itemPrice) {
        if (itemWeight > totalWeight) {
            return;
        }

        if (idx == count) {
            answer = Math.max(answer, itemPrice);
            return;
        }

        recur(idx + 1, itemWeight + items[idx][0], itemPrice + items[idx][1]);
        recur(idx + 1, itemWeight, itemPrice);
    }
}
