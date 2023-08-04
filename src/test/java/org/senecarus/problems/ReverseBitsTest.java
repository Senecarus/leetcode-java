package org.senecarus.problems;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void reverseBits() {
        Assert.assertEquals(-1073741825, ReverseBits.reverseBits(-3));
        Assert.assertEquals(964176192, ReverseBits.reverseBits(43261596));

    }
}