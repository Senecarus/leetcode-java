package org.senecarus.problems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        Assert.assertTrue(Arrays.equals(new int[]{1}, MergeSortedArray.merge(new int[]{0}, 0 , new int[]{1}, 1)));
        Assert.assertTrue(Arrays.equals(new int[]{1, 2}, MergeSortedArray.merge(new int[]{2, 0}, 1 , new int[]{1}, 1)));
        Assert.assertTrue(Arrays.equals(new int[]{1}, MergeSortedArray.merge(new int[]{1}, 1 , new int[]{}, 0)));
        Assert.assertTrue(Arrays.equals(new int[]{1,2,2,3,5,6}, MergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3 , new int[]{2,5,6}, 3)));

    }
}