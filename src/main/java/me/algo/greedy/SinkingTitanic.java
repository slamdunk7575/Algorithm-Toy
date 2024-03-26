package me.algo.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SinkingTitanic {

    public int solution(int[] nums, int m){
        int answer = 0;

        List<Integer> numbers = Arrays.stream(nums)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        int leftPoint = 0;
        int rightPoint = numbers.size() - 1;

        while (leftPoint <= rightPoint) {
            if (numbers.get(leftPoint) + numbers.get(rightPoint) <= m) {
                leftPoint++;
                rightPoint--;
            } else {
                rightPoint--;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        SinkingTitanic sinkingTitanic = new SinkingTitanic();
        System.out.println(sinkingTitanic.solution(new int[]{90, 50, 70, 100, 60}, 140));
        System.out.println(sinkingTitanic.solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
        System.out.println(sinkingTitanic.solution(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
    }
}
