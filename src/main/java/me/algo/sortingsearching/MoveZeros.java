package me.algo.sortingsearching;

public class MoveZeros {

    public int[] solve(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
                System.out.println("index: " + index);
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        return nums;
    }
}
