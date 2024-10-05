package me.boj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {

    public int solve(int n, int k, int[] coins) {

        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            int coin = coins[i];

            if (k / coin != 0) {
                count += k / coin;
                k = k % coin;
            }

            if (k == 0) {
                return count;
            }
        }

        return -1;
    }

    /*public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        System.out.println(solve(N, K, coins));
    }*/
}
