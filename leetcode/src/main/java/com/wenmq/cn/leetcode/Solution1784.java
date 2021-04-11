package com.wenmq.cn.leetcode;

/**
 * Q1784
 * https://leetcode-cn.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
 */
public class Solution1784 {
    /**
     * 1 <= s.length <= 100
     * s[i]​​​​ 为 '0' 或 '1'
     * s[0] 为 '1'
     * 0 之后不能有 1
     */
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

}
