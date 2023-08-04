package org.senecarus.problems;

public class ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

        int res = 0;
        for (int i = 0; i < 32 ; i++) {
            int v = (n & 1 << i) != 0 ? 1 : 0;
            v = v << 31 - i;
            res |= v;
        }

        return res;
    }


    public static int reverseBitsSimple(int n) {
        return Integer.reverse(n);
    }
}
