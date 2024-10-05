package me.algo.linkedlist;

import me.algo.datastructure.linkedlist.ListNode;
import me.algo.datastructure.linkedlist.MergeKSortedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MergeKSortedListTest {

    @Test
    @DisplayName("MergeKSortedList 테스트")
    public void merge_k_sorted_list() {
        // given
        MergeKSortedList mergeKSortedList = new MergeKSortedList();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;

        // when
        ListNode result = mergeKSortedList.solve(list);

        // then
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            System.out.println(result.val);
            resultList.add(result.val);
            result = result.next;
        }

        assertThat(resultList).containsExactly(1, 1, 2, 3, 4, 4, 5, 6);
    }

}
