package me.algo.string;

import java.util.HashSet;
import java.util.Set;

/**
 * (정리)
 * 1. 보석은 대소문자를 구분해서 가지고 있어야 한다. (예: aA -> 2개)
 * 2. 보석을 저장한다. (Set)
 * 3. Stone을 for문
 * 4. Set에 있는 값과 비교하면서 Count
 */
public class JewelsAndStones {

    public int solve(String jewelStr, String stoneStr) {
        // Data Structure
        Set<Character> uniqueJewels = new HashSet<>();

        // for & while
        char[] jewels = jewelStr.toCharArray();
        for (int i = 0; i < jewels.length; i++) {
            uniqueJewels.add(jewels[i]);
        }

        int count = 0;
        char[] stones = stoneStr.toCharArray();
        for (int i = 0; i < stones.length; i++) {
            if (uniqueJewels.contains(stones[i])) {
                count++;
            }
        }
        return count;
    }
}
