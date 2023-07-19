package org.senecarus.problems;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void myAtoi() {

        Assert.assertEquals(4193, StringToInteger.myAtoi("4193 with words"));

        Assert.assertEquals(2147483647, StringToInteger.myAtoi("21474836460"));

        Assert.assertEquals(1, StringToInteger.myAtoi("+1"));
        Assert.assertEquals(-2147483648, StringToInteger.myAtoi("-91283472332"));


        Assert.assertEquals(-42, StringToInteger.myAtoi("-42"));
        Assert.assertEquals(42, StringToInteger.myAtoi("42"));
    }
}