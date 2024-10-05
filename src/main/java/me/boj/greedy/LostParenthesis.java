package me.boj.greedy;

/**
 * (정리)
 * '+'을 먼저 계산하고(=괄호로 묶고) '-'를 계산한다
 */
public class LostParenthesis {

    public int solve(String input) {

        String[] numsBySub = input.split("-");
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < numsBySub.length; i++) {

            String[] numsByAdd = numsBySub[i].split("\\+");

            int sum = 0;
            for (int j = 0; j < numsByAdd.length; j++) {
                sum += Integer.parseInt(numsByAdd[j]);
            }

            if (result == Integer.MAX_VALUE) {
                result = sum;
            } else {
                result -= sum;
            }
        }

        return result;
    }
}
