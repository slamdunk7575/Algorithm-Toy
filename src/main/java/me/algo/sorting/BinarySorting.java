package me.algo.sorting;

import java.util.*;
import java.util.stream.IntStream;

public class BinarySorting {

    public int[] solution(int[] nums){
        int[] answer = new int[nums.length];

        Map<Integer, Integer> resultMap = new HashMap<>();

        IntStream.of(nums).forEach(num -> {
            String binaryString = Integer.toBinaryString(num);
            resultMap.put(num, countNumberOne(binaryString));
        });

        List<Integer> keySet = new ArrayList<>(resultMap.keySet());
        keySet.sort((a, b) -> resultMap.get(a) == resultMap.get(b) ? a - b : resultMap.get(a) - resultMap.get(b));

        for (int i = 0; i < keySet.size(); i++) {
            answer[i] = keySet.get(i);
        }

        return answer;
    }

    private Integer countNumberOne(String binaryString) {
        String[] binaryArr = binaryString.split("");

        long count = Arrays.asList(binaryArr).stream()
                .filter(binary -> binary.equals("1"))
                .count();

        return (int) count;
    }

    public static void main(String[] args){
        BinarySorting binarySorting = new BinarySorting();
        System.out.println(Arrays.toString(binarySorting.solution(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(binarySorting.solution(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(binarySorting.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }

}
