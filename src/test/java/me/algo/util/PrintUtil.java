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
}
