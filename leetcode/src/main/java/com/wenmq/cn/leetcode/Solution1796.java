package com.wenmq.cn.leetcode;

/**
 * Q1796
 * https://leetcode-cn.com/problems/second-largest-digit-in-a-string/
 */
public class Solution1796 {
    /**
     * 实际上是十个字符的问题
     * 可以用存储法
     */
    public int secondHighest(String s) {
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > '9' || c < '0') {
                continue;
            }
            flag |= (1 << ('9' - c));

        }
        flag &= flag - 1;
        for (int i = 1; i < 10; i++) {
            if ((flag & (1 << i)) != 0) {
                return 9 - i;
            }
        }
        return -1;


    }


    /**
     * 比较法
     */
    public int secondHighest2(String s) {
        char max = '0' - 1;
        char second = '0' - 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > '9' || c < '0') {
                continue;
            }
            if (c > max) {
                second = max;
                max = c;
            } else if (c > second && c < max) {
                second = c;
            }
        }
        return second - '0';
    }


}
