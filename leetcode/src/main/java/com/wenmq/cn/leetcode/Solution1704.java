package com.wenmq.cn.leetcode;

/**
 * Q1704
 * https://leetcode-cn.com/problems/determine-if-string-halves-are-alike/
 */
public class Solution1704 {
    /**
     * 统计元音数量即可
     */
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int length = s.length();
        int half = length >> 1;
        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count += i < half ? 1 : -1;
                    break;
                default:
                    // ignore
            }
        }
        return count == 0;
    }


}
