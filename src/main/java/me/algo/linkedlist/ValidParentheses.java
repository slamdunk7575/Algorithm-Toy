package me.algo.linkedlist;

import java.util.Stack;

public class ValidParentheses {

    public boolean solve(String text) {
        // 1. 담을 그릇 정하기
        if (text.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        // 2. for
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case ')':
                    if(!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if(!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if(!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(text.charAt(i));
                    break;
            }
        }

        return stack.isEmpty();
    }
}
