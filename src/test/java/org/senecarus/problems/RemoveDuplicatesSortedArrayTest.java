package org.senecarus.problems;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void removeDuplicates() {
        Assert.assertEquals(2, RemoveDuplicatesSortedArray.removeDuplicates(new int[]{1,2}));
        Assert.assertEquals(1, RemoveDuplicatesSortedArray.removeDuplicates(new int[]{1,1}));
        Assert.assertEquals(2, RemoveDuplicatesSortedArray.removeDuplicates(new int[]{1,1,2}));
        Assert.assertEquals(5, RemoveDuplicatesSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }
}