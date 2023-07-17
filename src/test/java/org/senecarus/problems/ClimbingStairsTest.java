package org.senecarus.problems;


import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {

        Assert.assertEquals(1, ClimbingStairs.climbStairs(1));
        Assert.assertEquals(2, ClimbingStairs.climbStairs(2));
        Assert.assertEquals(3, ClimbingStairs.climbStairs(3));
        Assert.assertEquals(5, ClimbingStairs.climbStairs(4));
        Assert.assertEquals(8, ClimbingStairs.climbStairs(5));
        Assert.assertEquals(13, ClimbingStairs.climbStairs(6));

    }

    @Test
    public void climbStairs1() {

        Assert.assertEquals(1, ClimbingStairs.climbStairsArray(1));
        Assert.assertEquals(2, ClimbingStairs.climbStairsArray(2));
        Assert.assertEquals(3, ClimbingStairs.climbStairsArray(3));
        Assert.assertEquals(5, ClimbingStairs.climbStairsArray(4));
        Assert.assertEquals(8, ClimbingStairs.climbStairsArray(5));
        Assert.assertEquals(13, ClimbingStairs.climbStairsArray(6));

    }
}