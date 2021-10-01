package me.algo.string;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewClustering {

    private static final String PATTERN = "^[a-zA-Z]*$";
    private static final int SUPPORT_NUM = 65536;

    public int solve(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return 0;
        }

        List<String> dividedStr1 = separateStr(str1);
        List<String> dividedStr2 = separateStr(str2);

        long intersection = dividedStr1.stream()
                .filter(str -> dividedStr2.contains(str))
                .count();

        int combination = Stream.concat(dividedStr1.stream(), dividedStr2.stream())
                .collect(Collectors.toList()).size() - (int) intersection;

        BigDecimal similarity = BigDecimal.valueOf(intersection).divide(BigDecimal.valueOf(combination), 5, RoundingMode.CEILING);
        BigDecimal result = similarity.multiply(BigDecimal.valueOf(SUPPORT_NUM));

        return result.intValue();
    }

    private List<String> separateStr(String input) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.length() - 1; i++) {
            String str = input.substring(i, i + 2).toUpperCase();
            if (isValidCharacters(str)) {
                result.add(str);
            }
        }

        return result;
    }

    private boolean isValidCharacters(String str){
        return Pattern.matches(PATTERN, str);
    }

}
