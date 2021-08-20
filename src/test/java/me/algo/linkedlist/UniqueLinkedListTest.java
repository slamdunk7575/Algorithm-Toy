package me.algo.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueLinkedListTest {

    @DisplayName("Linked 리스트 중복 제거")
    @Test
    void condense_test() {
        // given
        // 8, 3, 4, 3, 7, 7
        ListNode head = new ListNode(8);
        ListNode node1 = new ListNode(3);
        head.next = node1;
        ListNode node2 = new ListNode(4);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(7);
        node3.next = node4;
        ListNode node5 = new ListNode(7);
        node4.next = node5;

        // when
        UniqueLinkedList condense = new UniqueLinkedList();
        List<Integer> result = condense.remove(head);

        // then
        assertThat(result).containsAll(Arrays.asList(8, 3, 4, 7));
    }

}
