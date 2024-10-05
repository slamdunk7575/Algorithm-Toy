package me.algo.datastructure.queuestack;

import java.util.Stack;

public class StockPrice {

    public int[] solve(int[] prices) {
        int len = prices.length;

        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();

        // 스택에 prices 인덱스(i) 값을 쌓으면서 주식 값이 떨어지는 곳을 찾고 시간(초)을 구함
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        // 스택에 떨어지지 않고 남은 주식들은 총 시간(len) 에서 유지한 시간을 계산함
        // (예: 1, 2, 3, 2, 3) 에서 처음 1 값은 4초 동안 떨어지지 않고 유지되었음
        while (!stack.isEmpty()) {
            result[stack.peek()] = len - stack.peek() - 1;
            stack.pop();
        }

        return result;
    }
}
