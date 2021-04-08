package com.wenmq.cn.leetcode;

/**
 * Q392
 * https://leetcode-cn.com/problems/is-subsequence/
 */
public class Solution392 {
    /**
     * 方法一：
     */
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }



}
