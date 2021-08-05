package me.algo.string;

import java.util.Stack;

/**
 * (정리)
 * 1. 예: 73, 74, 75, 71, 69, 72, 76, 73
 * 2. '75' 가 나온 시점에 71 -> 69 -> 72 -> 76을 만나야 하는 상황
 * 3. for문을 돌면서 0번부터 Stack에 위치(index) 값을 저장
 * 4. 6번방(76)을 만나서 비교 (75<76)
 * 5. index를 이용해서 (6-2) 을 결과에 저장
 *
 * 시간복잡도: O(N)
 * - 대상: int[] temper
 * - 이유: for문 실행 (0 -> temper.length 까지 N번)
 * while문은 스택의 값을 바로 찾을 수 있다.
 * 하지만 최악의 경우는 익덱스 끝까지 가는 경우가 발생 이때는 O(N+M) -> 앞의 N 값에 비해 M은 작기 때문에 O(N)
 *
 * 공간복잡도: O(N)
 * - 대상: int[] result = new int[temper.length]
 * - 이유: for문 실행
 */
public class DailyTemperature {

        public int[] solve(int[] temper) {
            // 1. 담을 그릇 정하기
            Stack<Integer> stack = new Stack<>();
            int[] result = new int[temper.length];

            // 2. for 문
            for (int i = 0; i < temper.length; i++) {
                System.out.println("Temper: " + temper[i]);
                while (!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
                    int index = stack.pop();
                    System.out.println("i: " + i + ", index: " + index);
                    result[index] = i - index;
                }
                stack.push(i);
            }
            return result;
        }
}
