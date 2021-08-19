package me.algo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> solve(int[] inputs) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        if (inputs == null && inputs.length == 0) {
            return result;
        }

        dfs(inputs, result, nums);

        return result;
    }

    private void dfs(int[] inputs, List<List<Integer>> result, List<Integer> nums) {
        // 새로운 List 만들어서 담기
        if (nums.size() == inputs.length) {
            result.add(new ArrayList<>(nums));
        }

        // for 저장 -> 탈출
        for (int i = 0; i < inputs.length; i++) {
            // 같은 숫자가 포함되어 있는 경우 PASS
            if (nums.contains(inputs[i])) {
                continue;
            }
            nums.add(inputs[i]);
            dfs(inputs, result, nums);
            // (1, 1, 1) -> (1, 1, 삭제) -> (1, 1, 2) -> (1, 1, 삭제) -> (1, 1, 3) -> (1, 삭제, 삭제)
            // 이런식으로 저장
            nums.remove(nums.size() - 1);
        }
    }
}
