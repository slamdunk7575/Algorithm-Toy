package me.algo.bfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {


    @DisplayName("이진트리 레벨탐색")
    @Test
    void binary_search_tree() {
        // given
        BinarySearchTree tree  = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        // when
        tree.bfs(tree.root);

        // then
    }

}
