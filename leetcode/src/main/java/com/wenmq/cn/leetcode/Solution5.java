package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">
 * Q5
 * </a>
 */
public class Solution5 {
    /**
     * 1 <= s.length <= 1000
     * s 仅由数字和英文字母（大写和/或小写）组成
     */
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        String maxString = "";
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((maxLength >> 1) > chars.length - i) {
                break;
            }
            String palindromeEven = getPalindrome(chars, i, i + 1, maxLength);
            if (palindromeEven != null) {
                maxString = palindromeEven;
                maxLength = maxString.length();
            }
            String palindromeOdd = getPalindrome(chars, i, i, maxLength);
            if (palindromeOdd != null) {
                maxString = palindromeOdd;
                maxLength = maxString.length();
            }
        }
        return maxString;
    }

    private String getPalindrome(char[] chars, int left, int right, int maxLength) {
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        if (right - left > maxLength) {
            return String.valueOf(chars, ++left, right - left);
        }
        return null;
    }

    public String longestPalindrome2(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

}
