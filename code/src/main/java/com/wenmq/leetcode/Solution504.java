package com.wenmq.leetcode;

/**
 * Q504
 * https://leetcode-cn.com/problems/base-7/
 */
public class Solution504 {

    /**
     * convertToBase7
     */
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean minus = num < 0;
        if (minus) {
            num = -num;
        }
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (minus) {
            sb.append('-');
        }
        sb.reverse();
        return sb.toString();
    }

    public String convertToBase7S2(int num) {
        return Integer.toString(num, 7);
    }

}
