package com.wenmq.cn.leetcode;

/**
 * Q1071
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution1071 {
    /**
     * 1 <= str1.length <= 1000
     * 1 <= str2.length <= 1000
     * str1[i] 和 str2[i] 为大写英文字母
     */
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int maxCommonLength = gcd(len1, len2);
        String sub = str2.substring(0, maxCommonLength);
        return dividedBy(str1, sub) && dividedBy(str2, sub)
                ? sub : "";
    }

    private static boolean dividedBy(String big, String small) {
        int index = 0;
        int count = 0;
        while ((index = big.indexOf(small, index)) >= 0) {
            index += small.length();
            count++;
        }
        return count * small.length() == big.length();
    }

    private static int gcd(int a, int b) {
        return a != 0 ? gcd(b % a, a) : b;
    }


}
