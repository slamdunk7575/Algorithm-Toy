package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxDepthBinaryTreeDfsTest {

    @DisplayName("MaxDepthBinaryTreeDfs 테스트")
    @Test
    void max_depth_binary_tree_dfs_test() {
        // given
        MaxDepthBinaryTreeDfs maxDepthBinaryTreeDfs = new MaxDepthBinaryTreeDfs();

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.left.left = new TreeNode(6);

        // when
        int result = maxDepthBinaryTreeDfs.solve(node);

        // then
        assertThat(result).isEqualTo(4);
    }

}
