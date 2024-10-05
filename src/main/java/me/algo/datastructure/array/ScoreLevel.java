package me.algo.datastructure.array;

import java.util.*;
import java.util.stream.Collectors;

public class ScoreLevel {

    public int[] solution(int[] grades) {

        List<Integer> result = new ArrayList<>();

        List<Integer> sortedGrades = Arrays.stream(grades)
                .mapToObj(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Map<Integer, Integer> ranks = new HashMap<>();

        for (int i = 0; i < sortedGrades.size(); i++) {
            Integer grade = sortedGrades.get(i);
            ranks.put(grade, ranks.getOrDefault(grade, 0) + 1);
        }

        for (int grade : grades) {
            // 나보다 높은 점수를 받은 사람수 + 1 = 내 등수
            result.add(findHighGradeCount(ranks, grade) + 1);
        }

        return result.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    /*
     점수 - 사람수
       3 - 1
       2 - 2
       1 - 1
     */
    private int findHighGradeCount(Map<Integer, Integer> ranks, int grade) {
        return ranks.entrySet().stream()
                .filter(entry -> entry.getKey() > grade)
                .map(Map.Entry::getValue)
                .reduce(0, Integer::sum);
    }
}
