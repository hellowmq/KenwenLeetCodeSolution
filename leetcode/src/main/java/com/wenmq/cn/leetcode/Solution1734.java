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
        int first = (len % 4 == 1) ? 1 : 0;
//        int first = getXorResult(len);

        // [a(1) ^ a(2)] ^ [a(3) ^ a(4)] ^ ... ^ [a(n - 1) ^ a(n)]
        for (int i = 1; i < encoded.length; i += 2) {
            first ^= encoded[i];
        }

        // get origin[0]
        int[] origin = new int[len];
        origin[0] = first;

        // decode
        for (int i = 1; i < len; i++) {
            origin[i] ^= origin[i - 1] ^ encoded[i - 1];
        }
        return origin;
    }

    /**
     * 前 N 个正整数的异或公式
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
