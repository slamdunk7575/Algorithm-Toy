package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

    @Test
    @DisplayName("MaximumDepthOfBinaryTree 테스트")
    void maximum_depth_of_binary_tree_test() {
        // given
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.right.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);

        // when
        int solve = maximumDepthOfBinaryTree.solve(tree);

        // then
        assertThat(solve).isEqualTo(4);
    }

}
