package me.algo.datastructure.array;

public class MinSumPair {

    public int[] solve(int[] inputs) {

        int minSum = Integer.MAX_VALUE;
        int cumSum = 0;
        int result1 = inputs[0];
        int result2 = inputs[1];

        for (int i = 0; i < inputs.length - 1; i++) {
            int num1 = inputs[i];

            for (int j = i + 1; j < inputs.length; j++) {
                int num2 = inputs[j];
                cumSum = Math.abs(num1 + num2);

                if (cumSum < minSum) {
                    minSum = cumSum;
                    result1 = num1;
                    result2 = num2;
                }
            }
        }

        return new int[] {result1, result2};
    }
}
