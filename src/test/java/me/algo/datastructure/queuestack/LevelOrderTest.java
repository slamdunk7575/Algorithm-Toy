package me.algo.datastructure.queuestack;

import me.algo.datastructure.queuestack.LevelOrder;
import me.algo.datastructure.queuestack.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LevelOrderTest {

    @DisplayName("BinaryTree 각 레벨 값들 출력 (BFS)")
    @Test
    void level_order() {
        // given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        LevelOrder levelOrder = new LevelOrder();
        List<List<Integer>> result = levelOrder.solve(root);

        // when
        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactly(Arrays.asList(1),
                Arrays.asList(2, 3), Arrays.asList(4, 5));
    }

}
