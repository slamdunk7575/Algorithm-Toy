package me.algo.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class UniqueLinkedList {

    public List<Integer> remove(ListNode head) {

        List<Integer> result = new ArrayList<>();
        ListNode currentNode = head;

        while (currentNode.next != null) {
            ListNode findNode = currentNode;

            while (findNode.next != null) {
                if (currentNode.val == findNode.next.val) {
                    findNode.next = findNode.next.next;
                } else {
                    findNode = findNode.next;
                }
            }

            if (currentNode.next != null) {
                result.add(currentNode.val);
                currentNode = currentNode.next;
            }
        }

        result.add(currentNode.val);
        return result;
    }

}
