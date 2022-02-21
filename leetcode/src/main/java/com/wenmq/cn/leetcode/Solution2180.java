package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/count-integers-with-even-digit-sum/">
 * Q2180
 * </a>
 */
public class Solution2180 {
    /**
     * 1 <= num <= 1000
     */
    public int countEven(int num) {
        final int divide10 = num / 10;
        final int mod10 = num % 10;
        int lastBit = 0;
        int tmp = divide10;
        while (tmp > 0) {
            lastBit ^= tmp % 10;
            tmp /= 10;
        }
        return divide10 * 5 + (mod10 - (lastBit & 1) >> 1);
    }

    /**
     * 故弄玄虚也是蛮有意思的
     */
    public int countEven2(int num) {
        if ((num & 1) == 1) {
            return num >> 1;
        }
        int temp = num / 10;
        int state = 0;
        while (temp > 0) {
            state ^= temp % 10;
            temp /= 10;
        }
        return (num >> 1) - (state & 1);
    }

}
