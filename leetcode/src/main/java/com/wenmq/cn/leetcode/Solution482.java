package com.wenmq.cn.leetcode;

/**
 * Q482
 * https://leetcode-cn.com/problems/license-key-formatting/
 */
public class Solution482 {
    /**
     * S 的长度可能很长，请按需分配大小。K 为正整数。
     * S 只包含字母数字（a-z，A-Z，0-9）以及破折号'-'
     * S 非空
     * 先计算出长度，直接操作数组
     */
    public String licenseKeyFormatting(String s, int k) {
        char[] chars = s.toCharArray();
        int charCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '-') {
                charCount++;
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        int minusMod = 1 + (charCount - 1) % k;
        char[] chars2 = new char[charCount + (charCount - 1) / k];
        int cur = 0;
        int pre = 0;
        while (cur < chars2.length) {
            if (cur % (k + 1) == minusMod) {
                chars2[cur] = '-';
                cur++;
                continue;
            }
            while (chars[pre] == '-') {
                pre++;
            }
            chars2[cur] = chars[pre];
            pre++;
            cur++;
        }
        return String.valueOf(chars2);
    }


    /**
     * 不计算长度从后开始遍历，需要使用 StringBuilder 应对扩容
     */
    public String licenseKeyFormatting2(String s, int k) {
        char[] chars = s.toCharArray();
        int counter = 0;
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; --i) {
            char ch = chars[i];
            if (ch != '-') {
                ch = Character.toUpperCase(ch);
                if (counter >= k) {
                    sb.append('-').append(ch);
                    counter = 1;
                } else {
                    sb.append(ch);
                    ++counter;
                }
            }
        }
        return sb.reverse().toString();
    }
}
