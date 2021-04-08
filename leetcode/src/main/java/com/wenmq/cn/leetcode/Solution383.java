package com.wenmq.cn.leetcode;

/**
 * Q383
 * https://leetcode-cn.com/problems/ransom-note/
 */
public class Solution383 {
    /**
     * 方法一：
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            array[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            array[magazine.charAt(i) - 'a']--;
        }
        for (int value : array) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }


}
