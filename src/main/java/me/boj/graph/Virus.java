package me.boj.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Virus {

    public int solve(int infectedComputer, int computerCount, int[][] networks) {
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(infectedComputer);

        int[] checked = new int[computerCount + 1];
        checked[infectedComputer] = 1;
        
        while (!queue.isEmpty()) {

            Integer start = queue.poll();

            for (int i = 0; i < networks.length; i++) {
                if (networks[i][0] == start && checked[networks[i][1]] != 1) {
                    int connected = networks[i][1];
                    queue.offer(connected);
                    checked[connected] = 1;
                    count++;
                }
            }
        }

        return count;
    }
}
