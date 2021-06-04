package com.wenmq.cn.leetcode;

/**
 * Q1323
 * https://leetcode-cn.com/problems/maximum-69-number/
 */
public class Solution1323 {
    /**
     * 1 <= num <= 10^4
     * num 每一位上的数字都是 6 或者 9 。
     */
    public int maximum69Number(int num) {
        int mash = 1000;
        while (mash > 0) {
            if (num / mash % 9 != 0) {
                return num + 3 * mash;
            }
            mash /= 10;
        }
        return num;
    }

}
