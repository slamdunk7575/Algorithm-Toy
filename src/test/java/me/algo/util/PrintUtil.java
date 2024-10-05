package me.algo.util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintUtil {

    protected PrintUtil() {
    }

    public static void print(int[] arrs) {
        String result = Arrays.stream(arrs)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    public static void print(int[][] result) {
        Arrays.stream(result)
                .flatMapToInt(arr -> Arrays.stream(arr))
                .forEach(System.out::println);

        /*int m = result.length;
        int n = result[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]: " + result[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
