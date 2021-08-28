package me.algo.queuestack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> solve(TreeNode root) {
        // DS
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // for & while
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                nums.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(nums);
        }

        return result;
    }

}
