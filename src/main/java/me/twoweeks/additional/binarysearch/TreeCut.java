package me.twoweeks.additional.binarysearch;

import java.util.Arrays;

public class TreeCut {

    public int solve(int treeCount, int[] trees, int minWood) {

        int start = 1;
        int end = Arrays.stream(trees).max().getAsInt();

        while (start <= end) {
            int mid = (start + end) / 2;

            int woods = 0;
            for (int tree : trees) {
                if (tree >= mid) {
                    woods += (tree - mid);
                }
            }

            if (woods >= minWood) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}
