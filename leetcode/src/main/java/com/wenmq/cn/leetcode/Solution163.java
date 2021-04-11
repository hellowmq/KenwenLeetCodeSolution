package com.wenmq.cn.leetcode;

/**
 * Q163
 * https://leetcode-cn.com/problems/ugly-number/
 */
public class Solution163 {
    /**
     * 依次除即可
     */
    public boolean isUgly(int num) {
        while (num % 2 == 0) {
            num >>= 1;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

}
