package org.senecarus.problems;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1)
            return 1;

        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]){
                    nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
