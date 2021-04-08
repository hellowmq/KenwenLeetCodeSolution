package com.wenmq.cn.leetcode;

/**
 * Q242
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class Solution242 {

    /**
     * 说明:
     * 你可以假设字符串只包含小写字母。
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return s == null && t == null;
        }
        if (s.length() != t.length()) {
            return false;
        }
        final int charNum = 26;
        final char a = 'a';
        int[] array = new int[charNum];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            array[sChar[i] - a]++;
            array[tChar[i] - a]--;
        }
        for (int i = 0; i < charNum; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 发现我去年有做过这道题，当时写的代码就很优雅
     */
    public boolean isAnagram2(String s, String t) {
        if (s == null || t == null) {
            return s == null && t == null;
        }
        int[] charArray = new int[26];
        for (char c : s.toCharArray()) {
            charArray[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charArray[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (charArray[i] != 0) {
                return false;
            }
        }
        return true;

    }

}
