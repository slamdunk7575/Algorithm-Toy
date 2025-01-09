package me.twoweeks.additional.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TreeCutTest {

    @Test
    void tree_cut() {
        // given
        int treeCount = 4;
        int[] trees = { 20, 15, 10, 17 };
        int minWood = 7;

        // when
        TreeCut treeCut = new TreeCut();
        int result = treeCut.solve(treeCount, trees, minWood);

        // then
        assertThat(result).isEqualTo(15);
    }

}
