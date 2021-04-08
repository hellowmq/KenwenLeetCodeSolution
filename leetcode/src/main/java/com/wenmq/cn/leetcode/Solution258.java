package com.wenmq.cn.leetcode;

/**
 * Q258
 * https://leetcode-cn.com/problems/add-digits/
 */
public class Solution258 {
    /**
     * <p>
     * Digital root
     * </p>
     * https://brilliant.org/wiki/digital-root/
     * https://en.wikipedia.org/wiki/Digital_root
     */
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }


}
