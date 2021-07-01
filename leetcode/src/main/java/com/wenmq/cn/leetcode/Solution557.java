package com.wenmq.cn.leetcode;

/**
 * Q557
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */
public class Solution557 {
    /**
     * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
     */
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder(s.length());
        sb.append(s1[s1.length - 1]);
        for (int i = s1.length - 2; i >= 0; i--) {
            sb.append(' ').append(s1[i]);
        }
        return sb.reverse().toString();
    }

    public String reverseWords2(String s) {
        char[] chars = s.toCharArray();
        int slow = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                int fast = i - 1;
                extracted(chars, slow, fast);
                slow = i + 1;
            }
        }
        return String.valueOf(chars);
    }

    private static void extracted(char[] chars, int slow, int fast) {
        while (slow < fast) {
            char c = chars[fast];
            chars[fast--] = chars[slow];
            chars[slow++] = c;
        }
    }

}
