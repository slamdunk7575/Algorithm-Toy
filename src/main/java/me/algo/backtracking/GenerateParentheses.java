package me.algo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> solve(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", n, n, "");
        return result;
    }

    int count = 0;
    private void dfs(List<String> result, String str, int left, int right, String str1) {
        count++;
        System.out.println("str\t" + str + "\t left: " + left + "\t right: " + right + "\t count: " + count + "\t str1: " + str1);

        if (left < 0 || left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            result.add(str);
            return;
        }

        dfs(result, str+"(", left-1, right, str1+"+");
        dfs(result, str+")", left, right-1, str+"-");
    }
}
