package org.senecarus.problems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {

        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix1(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix1(new String[]{"a"}));

    }
}