package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">
 * Q3
 * </a>
 */
public class Solution3 {
    /**
     * 0 <= s.length <= 5 * 10^4
     * s 由英文字母、数字、符号和空格组成
     */
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();
        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

}
