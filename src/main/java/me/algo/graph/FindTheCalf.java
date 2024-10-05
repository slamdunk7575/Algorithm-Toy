package me.algo.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindTheCalf {

    int answer = 0;
    int[] directions = { 1, -1, 5 };
    int[] cache;

    Queue<Integer> queue = new LinkedList<>();
    public int bfs(int ownerPos, int calfPos) {
        cache = new int[10001];
        cache[ownerPos] = 1;
        queue.offer(ownerPos);
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int pos = queue.poll();

                for (int dir : directions) {
                    int nextPos = pos + dir;

                    // 자식 찾기
                    if (nextPos == calfPos ) {
                        return level + 1;
                    }

                    if (nextPos >= 1 && nextPos <= 10000 && cache[nextPos] == 0) {
                        cache[nextPos] = 1;
                        queue.offer(nextPos);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindTheCalf findTheCalf = new FindTheCalf();
        Scanner sc = new Scanner(System.in);
        int ownerPos = sc.nextInt();
        int calfPos = sc.nextInt();

        System.out.println(findTheCalf.bfs(ownerPos, calfPos));
    }
}
