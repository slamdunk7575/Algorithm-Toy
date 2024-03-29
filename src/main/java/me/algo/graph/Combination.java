package me.algo.graph;

import java.util.Scanner;

public class Combination {
    private static int n;
    private static int m;

    private static int[] combi;

    public void dfs(int depth, int s) {
        if (depth == m) {
            for (int value : combi) {
                System.out.print(value + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[depth] = i;
                dfs(depth + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Combination combination = new Combination();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        combination.dfs(0, 1);
    }
}
