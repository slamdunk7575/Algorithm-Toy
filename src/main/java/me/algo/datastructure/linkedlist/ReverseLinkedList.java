package me.algo.datastructure.linkedlist;

public class ReverseLinkedList {

    public ListNode solve(ListNode cur) {
        print("Reverse 전: ", cur);

        ListNode next = null;
        ListNode prev = null;

        while (cur != null) {
            // 현재 cur 노드의 다음을 저장해둠
            next = cur.next;
            // 이전 노드를 현재 cur 다음으로 변경
            cur.next = prev;
            prev = cur;
            // cur 다음으로 이동
            cur = next;
        }

        print("Reverse 후: ", prev);
        return prev;
    }

    private void print(String message, ListNode listNode) {
        System.out.println(message);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }
}
