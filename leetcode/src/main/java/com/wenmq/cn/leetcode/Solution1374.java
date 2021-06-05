package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q1374
 * https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 */
public class Solution1374 {
    /**
     * 没有限制字符使用次数，那就默认只使用一个字符，不合规则才调整
     */
    public String generateTheString(int n) {
        char[] a = new char[n];
        Arrays.fill(a, 'a');
        if ((n & 1) == 0) {
            a[0] = 'b';
        }
        return String.valueOf(a);
    }

}
