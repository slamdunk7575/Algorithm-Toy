package me.algo.graph;

import java.util.Objects;
import java.util.Stack;

public class MaximumDepthOfBinaryTreeDfs {

    public int solve(TreeNode root) {

        if (Objects.isNull(root)) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> levelStack = new Stack<>();
        stack.push(root);
        levelStack.push(1);
        int max = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int count = levelStack.pop();
            max = Math.max(max, count);

            if (node.left != null) {
                stack.push(node.left);
                levelStack.push(count + 1);
            }

            if (node.right != null) {
                stack.push(node.right);
                levelStack.push(count + 1);
            }

        }

        return max;
    }

}
