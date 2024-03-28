package me.algo.graph;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class BinarySearchTree {
    Node root;

    public void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int l = 0;
        while (!queue.isEmpty()) {
            int level = queue.size();
            System.out.println("LEVEL: " + l);

            for (int i = 0; i < level; i++) {
                Node cur = queue.poll();
                System.out.print("Current Data: " + cur.data);

                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }

                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }

                l++;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree  = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.bfs(tree.root);
    }
}
