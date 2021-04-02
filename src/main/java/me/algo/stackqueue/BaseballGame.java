package me.algo.stackqueue;

import java.util.Stack;

public class BaseballGame {

    public int solve(String[] texts) {
        Stack<Integer> stack = new Stack<>();

        for (String text : texts) {
            switch (text.toUpperCase()) {
                case "C" :
                    stack.pop();
                    break;
                case "D" :
                    stack.push(stack.peek() * 2);
                    break;
                case "+" :
                    int x = stack.pop();
                    int y = stack.pop();
                    int z = sum(x, y);
                    stack.push(y);
                    stack.push(x);
                    stack.push(z);
                    break;
                default:
                    stack.push(Integer.parseInt(text));
            }
        }

        int total = 0;

        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        return total;
    }

    private int sum (int x , int y) {
        return Integer.sum(x, y);
    }
}
