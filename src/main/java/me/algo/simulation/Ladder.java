package me.algo.simulation;

import java.util.Arrays;

public class Ladder {
    public char[] solution(int n, int[][] ladder) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (char)(65 + i);
        }

        /*int layer = ladder.length;
        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                int stick = ladder[i][j];
                if (stick != 0) {
                    swap(stick, answer);
                }
            }
        }*/

        for (int[] line : ladder) {
            for (int value : line) {
                swap(value, answer);
            }
        }

        return answer;
    }

    private void swap(int stick, char[] answer) {
        int currentPosition = stick - 1;
        char temp = answer[currentPosition];
        answer[currentPosition] = answer[currentPosition + 1];
        answer[currentPosition + 1] = temp;
    }

    public static void main(String[] args) {
        Ladder ladder = new Ladder();
        System.out.println(Arrays.toString(ladder.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(ladder.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(ladder.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(ladder.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }

    public String printResult(char[] answers) {
        StringBuilder sb = new StringBuilder();
        for (char answer : answers) {
            sb.append(answer);
        }
        return sb.toString();
    }
}
