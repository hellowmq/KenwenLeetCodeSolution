package com.wenmq.cn.leetcode;

/**
 * Q1528
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution1528 {
    /**
     * s.length == indices.length == n
     * 1 <= n <= 100
     * s 仅包含小写英文字母。
     * 0 <= indices[i] < n
     * indices 的所有的值都是唯一的（也就是说，indices 是整数 0 到 n - 1 形成的一组排列）。
     */
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }

}
