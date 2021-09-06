package me.algo.graph;

import java.util.*;

public class RemoveInvalidParentheses {

    public List<String> solve(String input) {

        List<String> result = new ArrayList<>();

        if (input == null) {
            return result;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(input);
        visited.add(input);

        boolean found = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();

                if (isValid(str)) {
                    result.add(str);
                    found = true;
                }

                // 괄호 6개 이하는 패스
                if (found) {
                    continue;
                }

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) != '(' && str.charAt(j) != ')') {
                        continue;
                    }

                    String newStr = str.substring(0, j) + str.substring(j + 1);
                    if (!visited.contains(newStr)) {
                        queue.offer(newStr);
                        visited.add(newStr);
                    }
                }
            }
        }

        return result;
    }

    private boolean isValid(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
                // ())( 인 경우
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

}
