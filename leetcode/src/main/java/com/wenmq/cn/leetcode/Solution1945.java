package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/sum-of-digits-of-string-after-convert/">
 * Q1945
 * </a>
 */
public class Solution1945 {

    /**
     * 1 <= s.length <= 100
     * 1 <= k <= 10
     * s 由小写英文字母组成
     */
    public int getLucky(String s, int k) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int cValue = c & 0x1F;
            count += cValue / 10 + cValue % 10;
        }
        while (--k > 0) {
            count = transform(count);
        }
        return count;
    }

    private static int transform(int count) {
        int num = 0;
        while (count > 0) {
            num += count % 10;
            count /= 10;
        }
        return num;
    }

}
