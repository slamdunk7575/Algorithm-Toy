package me.algo.list;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumLengthSequence {

    public static void main(String[] args) {
        MaximumLengthSequence maximumLengthSequence = new MaximumLengthSequence();
        System.out.println(maximumLengthSequence.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(maximumLengthSequence.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(maximumLengthSequence.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(maximumLengthSequence.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(maximumLengthSequence.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> inputs = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        for (Integer num : inputs) {
            if (inputs.contains(num - 1)) {
                continue;
            }

            int newAnswer = 0;
            while (inputs.contains(num)) {
                newAnswer++;
                num++;
            }

            answer = Math.max(answer, newAnswer);
        }

        /*for (Integer num : inputs) {

            List<Integer> result = new ArrayList<>();

            boolean isExistSmallerNum = inputs.stream()
                    .filter(cur -> cur == num - 1)
                    .findAny()
                    .isPresent();

            if (!isExistSmallerNum) {
                int preNum = num;
                result.add(preNum);
                for (Integer cur : inputs) {
                    if (cur == preNum + 1) {
                        result.add(cur);
                        preNum = cur;
                    }
                }

                int newAnswer = result.size();
                if (newAnswer > answer) {
                    answer = newAnswer;
                }
            }
        }*/

        return answer;
    }

}
