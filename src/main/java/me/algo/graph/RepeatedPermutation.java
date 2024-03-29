package me.algo.graph;

import java.util.Scanner;

public class RepeatedPermutation {

    private static int n;
    private static int m;
    private static int[] pm;

    public void dfs(int level) {
        if (level == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                dfs(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        RepeatedPermutation repeatedPermutation = new RepeatedPermutation();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        repeatedPermutation.dfs(0);
    }
}
