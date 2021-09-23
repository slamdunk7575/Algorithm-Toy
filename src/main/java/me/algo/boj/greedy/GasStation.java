package me.algo.boj.greedy;

/**
 * (정리)
 * 이전 도시의 기름 가격과 비교하여 내림차순인 경우 최소 기름값을 변경하면서 가격을 계산
 */
public class GasStation {

    public int solve(int city, int[] distances, int[] prices) {

        int oilPrice = 0;
        int minPrice = prices[0];

        for (int i = 0; i < city - 1; i++) {
            int distance = distances[i];

            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }

            oilPrice += distance * minPrice;
        }

        return oilPrice;
    }
}
