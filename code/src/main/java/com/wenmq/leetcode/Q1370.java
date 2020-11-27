package com.wenmq.leetcode;

import com.wenmq.tools.ArrayTools;

/**
 * Q1370
 * https://leetcode-cn.com/problems/increasing-decreasing-string/
 */
public class Q1370 {
    static class Solution {
        public String sortString(String s) {
            int[] buckets = new int[26];
            for (char c : s.toCharArray()) {
                buckets[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            while (sb.length() != s.length()) {
                for (int i = 0; i < 26; i++) {
                    if (buckets[i] == 0) {
                        continue;
                    }
                    sb.append((char) (i + 'a'));
                    buckets[i]--;
                }
                for (int i = 25; i >= 0; i--) {
                    if (buckets[i] == 0) {
                        continue;
                    }
                    sb.append((char) (i + 'a'));
                    buckets[i]--;
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortString("aaaabbbbcccc"));
        System.out.println(solution.sortString("rat"));
        System.out.println(solution.sortString("leetcode"));
        System.out.println(solution.sortString("ggggggg"));
        System.out.println(solution.sortString("spo"));
    }

}
