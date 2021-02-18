package com.wenmq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Q290
 * https://leetcode-cn.com/problems/word-pattern/
 */
public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] map = new String[26];
        Set<String> set = new HashSet<>();
        int i = 0;
        int j = 0;
        for (; i < pattern.length(); i++, j++) {
            int c = pattern.charAt(i) - 'a';
            int k = j;
            while (j < s.length() && s.charAt(j) != ' ') {
                ++j;
            }
            if (j == k) {
                return false;
            }
            String w = s.substring(k, j);
            if (map[c] == null && !set.contains(w)) {
                set.add(w);
                map[c] = w;
                continue;
            } else if (map[c] != null && map[c].equals(w)) {
                continue;
            }
            return false;
        }
        return i == pattern.length() && j >= s.length();
    }
}
