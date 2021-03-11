package com.wenmq.leetcode;

/**
 * Q137
 * https://leetcode-cn.com/problems/single-number-ii/
 */
public class Solution137 {
    /**
     * 二进制的异或运算（二进制加法）找出两个中的一个
     * 三个中的一个需要三进制加法
     * 00 +> 01 +> 10 +> 00
     */
    public int singleNumber(int[] nums) {
        int a = 0;
        int b = 0;
        for (int num : nums) {
            b = (b ^ num) & ~a;
            a = (a ^ num) & ~b;
        }
        return b;
    }


}
