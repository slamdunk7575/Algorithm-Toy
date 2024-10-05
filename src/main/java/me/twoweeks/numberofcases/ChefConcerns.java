package me.twoweeks.numberofcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefConcerns {

    private static int count;
    private static int[] danIngredient;
    private static int[] zzanIngredient;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());

        danIngredient = new int[count];
        zzanIngredient = new int[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            danIngredient[i] = Integer.parseInt(st.nextToken());
            zzanIngredient[i] = Integer.parseInt(st.nextToken());
        }

        recur(0, 1, 0, 0);
        System.out.println(answer);
    }

    private static void recur(int idx, int dan, int zzan, int used) {
        if (idx == count) {
            if (used == 0) {
                return;
            }
            int result = Math.abs(dan - zzan);
            System.out.println("answer: " + answer + ", result: " + result);
            answer = Math.min(answer, result);
            return;
        }

        recur(idx + 1, dan * danIngredient[idx], zzan + zzanIngredient[idx], used + 1);
        recur(idx + 1, dan, zzan, used);
    }
}
