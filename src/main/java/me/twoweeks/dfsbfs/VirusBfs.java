package me.twoweeks.dfsbfs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VirusBfs {

    public int solve(int count, int graphCount, int[][] graph) {

        Map<Integer, List<Integer>> graphMap = new HashMap<>();
        for (int i = 0; i < graphCount; i++) {
            int connection1 = graph[i][0];
            int connection2 = graph[i][1];

            graphMap.computeIfAbsent(connection1, k -> new ArrayList<>()).add(connection2);
            graphMap.computeIfAbsent(connection2, k -> new ArrayList<>()).add(connection1);
        }

        Map<Integer, Integer> visited = new HashMap<>();
        visited = IntStream.rangeClosed(1, 7)
                .boxed()
                .collect(Collectors.toMap(key -> key, value -> 0));

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);

        while (!queue.isEmpty()) {
            int k = queue.pop();
            visited.put(k, 1);

            List<Integer> connections = graphMap.get(k);
            for (Integer connection : connections) {
                if (visited.get(connection) == 0) {
                    queue.add(connection);
                }
            }
        }

        return (int) visited.values().stream()
                .filter(value -> value == 1)
                .count() - 1;
    }
}
