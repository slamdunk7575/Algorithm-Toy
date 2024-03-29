package me.algo.graph;

import java.util.Scanner;

public class Permutation {

    private static int n;
    private static int m;

    private static int[] arr;
    private static int[] pm;
    private static int[] check;

    public void dfs(int l) {
        if (l == m) {
            for (int value : pm) {
                System.out.print(value + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[l] = arr[i];
                    dfs(l + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        check = new int[n];
        pm = new int[m];

        permutation.dfs(0);
    }
}
