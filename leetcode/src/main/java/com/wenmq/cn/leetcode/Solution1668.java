package com.wenmq.cn.leetcode;

/**
 * Q1688
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution1668 {
    /**
     * 匹配更长的字符串
     */
    public int maxRepeating(String sequence, String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        while (sequence.contains(stringBuilder.toString())) {
            stringBuilder.append(word);
        }
        return stringBuilder.length() / word.length() - 1;
    }

    /**
     * 遍历字符，需要更多的控制变量
     */
    public int maxRepeating2(String sequence, String word) {
        int m = sequence.length();
        int n = word.length();
        int i = 0;
        int res = 0;
        while (i < m) {
            int count = 0;
            int j = 0;
            int t = i;
            while (t < m && j < n && sequence.charAt(t) == word.charAt(j)) {
                t++;
                j++;
                if (j == n) {
                    count++;
                    j = 0;
                }
            }
            res = Math.max(res, count);
            i++;
        }
        return res;
    }


}
