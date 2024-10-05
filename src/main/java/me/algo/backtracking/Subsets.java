package me.algo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * (정리)
 * Permutation 문제와 비슷하게 풀 수 있다.
 * dfs() 에서 int start 값을 이용하여 파고드는 부분이 다르다.
 */
public class Subsets {

    public List<List<Integer>> solve(int[] inputs) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        if (inputs == null || inputs.length == 0) {
            return result;
        }

        dfs(inputs, result, nums, 0);
        return result;
    }

    private void dfs(int[] inputs, List<List<Integer>> result, List<Integer> nums, int start) {
        if (nums != null && nums.size() > 0) {
            // List 만들어서 담기
            List<Integer> newList = new ArrayList<>(nums);
            result.add(newList);
        }

        for (int i = start; i < inputs.length; i++) {
            nums.add(inputs[i]);
            dfs(inputs, result, nums, i + 1);
            // (1) -> (1, 2) -> (1, 2, 3) -> (1, 2, 삭제) -> (1, 삭제) -> (1, 3) -> (1, 삭제) -> (삭제) -> 2 ->
            // 이런식으로 저장
            nums.remove(nums.size() - 1);
        }
    }
}
