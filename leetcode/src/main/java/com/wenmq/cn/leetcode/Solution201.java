package com.wenmq.cn.leetcode;

/**
 * Q201
 * https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 */
public class Solution201 {

    /**
     * 从 left 到 right 公共前缀不会改变
     * 非公共前缀都会置 0
     */
    public int rangeBitwiseAnd(int left, int right) {
        while (right > left) {
            right &= right - 1;
        }
        return right;
    }


}
