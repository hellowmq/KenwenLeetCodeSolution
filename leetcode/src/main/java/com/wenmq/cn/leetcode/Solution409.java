package com.wenmq.cn.leetcode;

/**
 * Q409
 * https://leetcode-cn.com/problems/longest-palindrome/
 */
public class Solution409 {
    /**
     * 假设字符串的长度不会超过 1010。
     */
    public int longestPalindrome(String s) {
        short[] set = new short[0x3F];
        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i) - 'A']++;
        }
        int sum = 0;
        for (short count : set) {
            sum += count & 0xFFFE;
        }
        if (sum < s.length()) {
            sum++;
        }
        return sum;
    }

    public int longestPalindrome2(String s) {
        short[] set = new short[0x3F];
        for (char i : s.toCharArray()) {
            set[i - 'A']++;
        }
        int sum = 0;
        for (short count : set) {
            sum += count & 0xFFFE;
        }
        if (sum < s.length()) {
            sum++;
        }
        return sum;
    }

    public int longestPalindrome3(String s) {
        short[] set = new short[0x3F];
        for (char i : s.toCharArray()) {
            set[i - 64]++;
        }
        int sum = 0;
        for (short count : set) {
            sum += count >>> 1;
        }
        sum <<= 1;
        if (sum < s.length()) {
            sum++;
        }
        return sum;
    }

}
