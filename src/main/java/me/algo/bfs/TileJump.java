package me.algo.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class TileJump {

    public int solution(int[] nums) {
        int n = nums.length;
        int[] cache = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        cache[0] = 1;
        int level = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                int current = queue.poll();
                for (int j = 1; j <= nums[current]; j++) {
                    int nextJump = current + j;
                    if (nextJump == n - 1) {
                        return level + 1;
                    }

                    if (nextJump < n && cache[nextJump] == 0) {
                        cache[nextJump] = 1;
                        queue.offer(nextJump);
                    }
                }
            }
            level++;
        }

        return -1;
    }

    public static void main(String[] args) {
        TileJump tileJump = new TileJump();
        System.out.println(tileJump.solution(new int[]{2, 2, 1, 2, 1, 1}));
        // System.out.println(tileJump.solution(new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
        // System.out.println(tileJump.solution(new int[]{2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1}));
        // System.out.println(tileJump.solution(new int[]{1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1}));
        // System.out.println(tileJump.solution(new int[]{1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1}));
    }
}
