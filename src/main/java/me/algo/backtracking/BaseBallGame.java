package me.algo.backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaseBallGame {

    private static class GameInfo {
        private String num;
        private int strike;
        private int ball;

        public GameInfo(String num, int strike, int ball) {
            this.num = num;
            this.strike = strike;
            this.ball = ball;
        }

        public String getNum() {
            return num;
        }

        public int getStrike() {
            return strike;
        }

        public int getBall() {
            return ball;
        }
    }

    private static int n;
    private static List<GameInfo> gameInfoList = new ArrayList<>();
    private static List<String> answers = new ArrayList<>();
    private static boolean[] numUsing;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        numUsing = new boolean[10];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String num = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            gameInfoList.add(new GameInfo(num, strike, ball));
        }

        play("", 0);
        bw.write(answers.size() + "");

        bw.flush();
        bw.close();
        br.close();
    }

    // 숫자 야구의 모든 경우의 수를 만드는 함수
    private static void play(String num, int size) {
        if (size == 3) {
            numCheck(num);
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (!numUsing[i]) {
                numUsing[i] = true;
                play(num + i, size + 1);
                numUsing[i] = false;
            }
        }
    }

    private static void numCheck(String playNum) {
        for (GameInfo gameInfo : gameInfoList) {
            int strike = 0;
            int ball = 0;

            // 스트라이크 조건 만족하는지 확인
            for (int i = 0; i < 3; i++) {
                if (gameInfo.getNum().charAt(i) == playNum.charAt(i)) {
                    strike++;
                }
            }

            if (gameInfo.getStrike() != strike) {
                return;
            }

            // 볼 조건 만족하는지 확인
            for (int i = 0; i < 3; i++) {
                int temp = (i + 1) % 3;
                if (playNum.charAt(i) == gameInfo.getNum().charAt(temp)) {
                    ball++;
                }

                temp = (i + 2) % 3;
                if (playNum.charAt(i) == gameInfo.getNum().charAt(temp)) {
                    ball++;
                }
            }

            if (gameInfo.getBall() != ball) {
                return;
            }

            answers.add(playNum);
        }
    }
}
