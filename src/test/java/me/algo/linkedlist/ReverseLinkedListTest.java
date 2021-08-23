package me.algo.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

    @DisplayName("Singly Linked List 역으로 정렬하기")
    @Test
    void reverse_linked_list() {
        // given
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        // when
        ListNode result = reverseLinkedList.solve(node1);

        // then
        assertThat(result.val).isEqualTo(3);
        assertThat(result.next.val).isEqualTo(2);
        assertThat(result.next.next.val).isEqualTo(1);
    }

}
