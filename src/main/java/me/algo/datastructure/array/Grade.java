package me.algo.datastructure.array;

import java.util.*;
import java.util.stream.Collectors;

public class Grade {

    public String solution(int[][] scores) {

        if (scores.length == 0 && scores[0].length == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        List<Integer> myGrades;

        for (int j = 0; j < scores.length; j++) {
            int selfRating = 0;
            myGrades = new ArrayList<>();

            for (int i = 0; i < scores[0].length; i++) {
                if (i == j) {
                    selfRating = scores[i][j];
                }
                myGrades.add(scores[i][j]);
            }

            boolean isMaxOrMin = checkMaxOrMin(myGrades, selfRating);

            if (isMaxOrMin) {
                int copySelfRating = selfRating;
                myGrades = myGrades.stream()
                        .filter(grade -> grade != copySelfRating)
                        .collect(Collectors.toList());
            }

            double average = myGrades.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .getAsDouble();

            String grade = findGrade(average);
            sb.append(grade);
        }

        return sb.toString();
    }

    private boolean checkMaxOrMin(List<Integer> nums, int selfRating) {

        int max = nums.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchElementException::new);

        int min = nums.stream()
                .mapToInt(x -> x)
                .min()
                .orElseThrow(NoSuchElementException::new);

        long count = nums.stream()
                .filter(num -> num == selfRating)
                .count();

        if ((max == selfRating || min == selfRating) && count == 1) {
            return true;
        }

        return false;
    }

    private String findGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
}
