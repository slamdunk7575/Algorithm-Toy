package me.algo.datastructure.queuestack;

import java.util.*;

public class Delimiters {

    public List<String> solve(String delimiter, String input) {

        List<String> result = new ArrayList<>();

        Set<String> delimiters = new HashSet<>();
        int len = delimiter.length();

        for (int i = 0; i < len; i++) {
            char a = delimiter.charAt(i);
            for (int j = 0; j < len; j++) {
                char b = delimiter.charAt(j);
                delimiters.add(String.valueOf(a) + String.valueOf(b));
            }
        }

        Iterator<String> iterator = delimiters.iterator();
        while (iterator.hasNext()) {
            String separator = iterator.next();
            System.out.println(separator);

            Queue<String> queue = new LinkedList<>();
            for (int i = 0; i < separator.length(); i++) {
                char del = separator.charAt(i);
                queue.offer(String.valueOf(del));
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                sb.append(input.charAt(i));
                if (!queue.isEmpty()) {
                    sb.append(queue.poll());
                }
            }

            result.add(sb.toString());
        }
        return result;
    }

}
