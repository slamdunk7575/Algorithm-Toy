package me.algo.datastructure.linkedlist;

import java.util.Objects;

public class AddTwoNumbers {

    public ListNode solve(ListNode listNode1, ListNode listNode2) {

        // Dummy 데이터
        ListNode head = new ListNode(0);
        ListNode p1 = listNode1;
        ListNode p2 = listNode2;
        ListNode p3 = head;
        int carry = 0;

        while (Objects.nonNull(p1) || Objects.nonNull(p2)) {
            if(Objects.nonNull(p1)) {
                carry += p1.val;
                p1 = p1.next;
            }

            if(Objects.nonNull(p2)) {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry % 10);
            p3 = p3.next;
            carry /= 10;
        }

        if (carry == 1) {
            p3.next = new ListNode(1);
        }

        // head 에는 결과 값들이 연결되어 있음
        return head.next;
    }

}
