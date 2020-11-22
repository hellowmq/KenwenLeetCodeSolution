package com.wenmq.leetcode;

/**
 * Q242
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class Q242 {
    static class Solution {

        public boolean isAnagram(String s, String t) {
            if (s == null || t == null) {
                return s == null && t == null;
            }
            if (s.length() != t.length()) return false;
            final int charNum = 26;
            final char a = 'a';
            int[] array = new int[charNum];
            char[] schar = s.toCharArray();
            char[] tchar = t.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                array[schar[i] - a]++;
                array[tchar[i] - a]--;
            }
            for (int i = 0; i < charNum; i++) {
                if (array[i] != 0) return false;
            }
            return true;
        }

        /**
         * 发现我去年有做过这道题，当时写的代码就很优雅
         */
        public boolean isAnagram2(String s, String t) {

            int[] nums = new int[26];
            for (char c : s.toCharArray()) {
                nums[c - 'a']++;
            }
            for (char c : t.toCharArray()) {
                nums[c - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (nums[i] != 0) return false;
            }
            return true;

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "anagram", t = "nagaram";
        String s1 = "rat", t1 = "car";
        System.out.println(solution.isAnagram(s, t));
        System.out.println(solution.isAnagram(s1, t1));
    }

}
