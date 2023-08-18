package org.senecarus.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSumSubOptimal(int[] nums, int target) {
        int[] res = {0, 0} ;

        for (int i =0; i < nums.length; i++) {
            res[0] = i;

            for (int j =0; j < nums.length; j++) {

                if (i != j && nums[i] + nums[j] == target){
                    res[1] = j;
                    return res;
                }
            }

        }

        return res;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<>();

        for (int i =0; i < nums.length; i++) {

            int compliment = target - nums[i];
            if (dic.containsKey(compliment))
                return new int[]{dic.get(compliment), i};
            else
                dic.put(nums[i], i);

        }

        return new int[]{0,0};
    }
}
