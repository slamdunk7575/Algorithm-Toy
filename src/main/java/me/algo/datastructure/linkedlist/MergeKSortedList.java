package me.algo.datastructure.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

    public ListNode solve(ListNode[] listNodes) {
        // 1. 담을 그릇 정하기
        PriorityQueue<ListNode> queue = new PriorityQueue<>(comp);
        ListNode newHead = new ListNode(0);
        ListNode result = newHead;

        for (ListNode node : listNodes) {
            if(node != null) {
                queue.offer(node);
            }
        }

        // 2. while
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            result.next = node;
            result = result.next;

            if(node.next != null) {
                queue.offer(node.next);
            }
        }

        return newHead.next;
    }

    Comparator<ListNode> comp = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode a, ListNode b) {
            return a.val - b.val;
        }
    };
}
