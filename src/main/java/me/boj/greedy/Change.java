package me.boj.greedy;

import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Change {

    private final List<Integer> coins = Arrays.asList(500, 100, 50, 10, 5, 1);

    public int solve(int input) {

        int change = 1000 - input;
        int count = 0;

        for (int coin : coins) {
            int share = change / coin;

            if (share != 0) {
                count += share;
                change = change % coin;
            }

            if (change == 0) {
                return count;
            }
        }

        return -1;
    }

    /*public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        br.close();

        int result = solve(input);
        System.out.println(result);
    }*/
}
