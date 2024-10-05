package me.twoweeks.topdowndp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counsel {

    private static int count;
    private static int[][] schedules;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());

        schedules = new int[count][2];

        for (int i = 0; i < count; i++) {
            String[] inputArr = br.readLine().split(" ");
            int day = Integer.parseInt(inputArr[0]);
            int price = Integer.parseInt(inputArr[1]);
            schedules[i][0] = day;
            schedules[i][1] = price;
        }

        recur(0, 0);
        System.out.println(answer);
    }

    private static void recur(int idx, int schedulePrice) {
        if (idx == count - 1) {
            answer = Math.max(answer, schedulePrice);
            return;
        }

        if (idx > count - 1) {
            return;
        }

        recur(idx + schedules[idx][0], schedulePrice + schedules[idx][1]);
        recur(idx + 1, schedulePrice);
    }
}
