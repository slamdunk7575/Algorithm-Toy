package me.algo.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumAirfare {
    public int solution(int cityCount, int[][] flights, int start, int end, int transfer) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        int[] fareSum = new int[cityCount];
        int level = 0;

        while (!queue.isEmpty()) {
            int visitCount = queue.size();

            for (int j = 0; j < visitCount; j++) {

                if (level > transfer) {
                    answer = fareSum[end];
                    return answer;
                }

                Integer current = queue.poll();
                int preStart = 0;
                int preFare = 0;

                for (int i = 0; i < flights.length; i++) {
                    int[] flightSection = flights[i];
                    int sectionStart = flightSection[0];
                    int sectionEnd = flightSection[1];
                    int sectionFare = flightSection[2];

                    if (preStart == sectionStart && sectionEnd == current) {
                        preFare = sectionFare;
                    }

                    if (sectionStart == current) {

                        queue.offer(sectionEnd);
                        int currentFareSum = preFare + sectionFare;

                        if (level >= 1) {
                            fareSum[sectionEnd] = currentFareSum < fareSum[sectionEnd] ? currentFareSum : fareSum[sectionEnd];
                        } else {
                            fareSum[sectionEnd] = currentFareSum;
                        }
                    }
                }
            }
            level++;
        }

        return -1;
    }

    public static void main(String[] args) {
        MinimumAirfare minimumAirfare = new MinimumAirfare();
        System.out.println(minimumAirfare.solution(5, new int[][]{{0, 1, 10}, {1, 2, 20}, {0, 2, 70}, {0, 3, 100}, {1, 3, 80}, {2, 3, 10}, {2, 4, 30}, {3, 4, 10}}, 0, 3, 1));
        System.out.println(minimumAirfare.solution(4, new int[][]{{0, 1, 10}, {0, 2, 10}, {1, 3, 5}, {2, 3, 3}}, 0, 3, 0));
        System.out.println(minimumAirfare.solution(8, new int[][]{{0, 3, 10}, {1, 5, 10}, {1, 7, 100}, {0, 1, 10}, {0, 2, 10}, {5, 7, 30}, {3, 7, 10}, {1, 3, 5}, {2, 3, 3}}, 1, 7, 2));
        System.out.println(minimumAirfare.solution(10, new int[][]{{1, 8, 50}, {0, 8, 30}, {1, 0, 10}, {2, 8, 10}, {0, 3, 10}, {1, 5, 10}, {1, 7, 100}, {0, 1, 10}, {0, 2, 10}, {5, 7, 30}, {3, 7, 10}, {1, 3, 5}, {2, 3, 3}}, 1, 8, 2));
        System.out.println(minimumAirfare.solution(4, new int[][]{{0, 3, 59}, {2, 0, 83}, {3, 1, 16}, {1, 3, 16}}, 3, 0, 3));
    }


}
