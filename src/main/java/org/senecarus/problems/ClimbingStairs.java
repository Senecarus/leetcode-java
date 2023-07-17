package org.senecarus.problems;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static int climbStairs(int n) {

        HashMap<Integer, Integer> memo = new HashMap<>();
        return helper(n, memo);

    }

    private static int helper (int n , Map<Integer, Integer> memo) {

        if (n == 0 || n == 1) {
            return 1;
        }

        Integer res = memo.get(n);

        if (res != null) {
            return res;
        }

        res = helper(n-1, memo) + helper(n-2, memo);
        memo.put(n, res);
        return res;
    }


    public static int climbStairsArray(int n) {
        if(n==1) return 1;

        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}
