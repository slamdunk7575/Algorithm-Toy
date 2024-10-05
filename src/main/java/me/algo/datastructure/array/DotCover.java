package me.algo.datastructure.array;

import java.util.*;
import java.util.stream.Collectors;

public class DotCover {

    public int solution(int[] dots, int[] lines) {
        int result = 0;

        int totalRange = getTotalDotRange(dots);

        int totalCoverRange = Arrays.stream(lines)
                .filter(line -> line == totalRange)
                .findAny()
                .orElse(0);

        if (totalCoverRange != 0) {
           result = 1;
           return result;

        } else {
            // 초기화
            List<Integer> lineValues = Arrays.stream(lines)
                    .mapToObj(Integer::valueOf)
                    .collect(Collectors.toList());

            Map<Integer, Boolean> dotCoveredResult = new HashMap<>();
            for (int i = 0; i < dots.length; i++) {
                dotCoveredResult.put(dots[i], Boolean.FALSE);
            }

            for (int i = 0; i < dots.length - 1; i++) {
                int dot = dots[i];
                int nextDot = dots[i + 1];

                if (dotCoveredResult.get(dot) == Boolean.TRUE
                        && dotCoveredResult.get(nextDot) == Boolean.TRUE) {
                   continue;
                }

                int range = nextDot - dot;

                Integer coverLine = lineValues.stream()
                        .filter(line -> line >= range)
                        .findAny()
                        .orElse(0);

                if (coverLine != 0) {
                    lineValues.remove(coverLine);
                    dotCoveredResult.put(dot, Boolean.TRUE);
                    dotCoveredResult.put(nextDot, Boolean.TRUE);
                    result += 1;
                }
            }
        }

        return result;
    }

    private int getTotalDotRange(int[] dots) {
        int total = 0;
        for (int i = 0; i < dots.length - 1; i++) {
            total += dots[i + 1] - dots[i];
        }
        return total;
    }

}
