package me.algo.linkedlist;

import me.algo.datastructure.linkedlist.AddTwoNumbers;
import me.algo.datastructure.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class AddTwoNumbersTest {

    @DisplayName("AddTwoNumbers 테스트")
    @Test
    void add_two_numbers_test() {
        // given
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(2);

        // when
        ListNode result = addTwoNumbers.solve(listNode1, listNode2);

        // then
        while (Objects.nonNull(result)) {
            System.out.println(String.format("%d", result.val));
            result = result.next;
        }
    }

}
