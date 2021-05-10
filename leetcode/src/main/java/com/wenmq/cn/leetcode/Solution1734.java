package com.wenmq.cn.leetcode;

/**
 * Q1734
 * https://leetcode-cn.com/problems/decode-xored-permutation/
 */
public class Solution1734 {
    /**
     * 3 <= n < 105
     * n 是奇数
     * encoded.length == n - 1
     */
    public int[] decode(int[] encoded) {
        int len = encoded.length + 1;
        // a(0) ^ a(1) ^ a(2) ^ a(3) ^ a(4) ^... ^ a(n - 1) ^ a(n)
        int first = getXorResult(len);

        // [a(1) ^ a(2)] ^ [a(3) ^ a(4)] ^ ... ^ [a(n - 1) ^ a(n)]
        for (int i = 1; i < encoded.length; i += 2) {
            first ^= encoded[i];
        }

        int[] decode = new int[len];
        decode[0] = first;

        for (int i = 1; i < len; i++) {
            decode[i] ^= decode[i - 1] ^ encoded[i - 1];
        }
        return decode;
    }

    /**
     * 前 N 个正整数的异或
     */
    public static int getXorResult(int p) {
        if (p < 0) {
            return 0;
        }
        int a = p & 3;
        switch (a) {
            case 0:
                return p;
            case 1:
                return 1;
            case 2:
                return p + 1;
            default:
                return 0;
        }
    }


}
