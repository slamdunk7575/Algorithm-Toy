package me.algo.graph;

/**
 * (정리)
 * 재귀호출로 해결 -> 재귀호출은 곧 Stack 이다.
 * left 부터 null 을 만날때까지 내려가면 +1 카운트 되고
 * 하나씩 위로 올라가면서 아래식으로 카운트 한다.
 * Math.max(leftMax, rightMax) + 1
 *
 *                     3
 *                   /  \
 *                 1     4
 *               /   \
 *             5      8
 *           /      /  \
 *         7      null  null
 *       /  \
 *    null  null
 *
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        System.out.println(root.val);
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return Math.max(leftMax, rightMax) + 1;
    }
}
