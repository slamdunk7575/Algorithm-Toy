package me.algo.graph;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTreeBfs {

    public int solve(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        int count = 0;

        while (!nodes.isEmpty()) {
            int size = nodes.size();

            for (int i = 0; i < size; i++) {
                TreeNode curNode = nodes.poll();
                if (curNode.left != null) {
                    nodes.offer(curNode.left);
                }

                if (curNode.right != null) {
                    nodes.offer(curNode.right);
                }
            }
            count++;
        }

        return count;
    }
}
