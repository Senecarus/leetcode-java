package org.senecarus.problems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {

        Assert.assertEquals("[0, 1]", Arrays.toString(TwoSum.twoSum(new int[]{2,7,11,15}, 9)));

        Assert.assertEquals("[1, 2]", Arrays.toString(TwoSum.twoSum(new int[]{3,2,4}, 6)));

        Assert.assertEquals("[0, 1]", Arrays.toString(TwoSum.twoSum(new int[]{3,3}, 6)));
    }
}