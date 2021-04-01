package com.wenmq.leetcode;

/**
 * Q917
 * https://leetcode-cn.com/problems/reverse-only-letters/
 */
public class Solution917 {
    /**
     * 方法一：经典双指针法
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (notLetter(chars[left])) {
                left++;
                continue;
            }
            if (notLetter(chars[right])) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.copyValueOf(chars);
    }

    /**
     * 根据题目条件 33 <= S[i].ASCIIcode <= 122
     * 约束条件可以写得简洁点
     */
    private boolean notLetter(char aChar) {
        return aChar < 'A' || (aChar > 'Z' && aChar < 'a');
    }

}
