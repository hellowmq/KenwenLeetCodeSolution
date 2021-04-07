package com.wenmq.leetcode;

/**
 * Q434
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 */
public class Solution434 {
    /**
     * 方法一：
     */
    public int countSegments(String s) {
        String[] s1 = s.split(" ");
        int res = 0;
        for (String s2 : s1) {
            if (s2.length() > 0) {
                res++;
            }
        }
        return res;
    }


}
