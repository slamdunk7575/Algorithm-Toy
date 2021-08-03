package me.algo.string;

import java.util.Stack;

public class DailyTemperature {

        public int[] solve(int[] temper) {
            // 1. 담을 그릇 정하기
            Stack<Integer> stack = new Stack<>();
            int[] result = new int[temper.length];

            // 2. for 문
            for (int i = 0; i < temper.length; i++) {
                System.out.println("Temper: " + temper[i]);
                while (!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
                    int index = stack.pop();
                    System.out.println("i: " + i + ", index: " + index);
                    result[index] = i - index;
                }
                stack.push(i);
            }
            return result;
        }
}
