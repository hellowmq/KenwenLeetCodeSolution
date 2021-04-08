package com.wenmq.cn.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Q290
 * https://leetcode-cn.com/problems/word-pattern/
 */
public class Solution290 {
    /**
     * 单词规律
     */
    public boolean wordPattern(String pattern, String s) {
        String[] map = new String[26];
        Set<String> set = new HashSet<>();
        int patternIndex = 0;
        int charIndex = 0;
        for (; patternIndex < pattern.length(); patternIndex++, charIndex++) {
            int c = pattern.charAt(patternIndex) - 'a';
            int k = charIndex;
            while (charIndex < s.length() && s.charAt(charIndex) != ' ') {
                ++charIndex;
            }
            if (charIndex == k) {
                return false;
            }
            String w = s.substring(k, charIndex);
            if (map[c] == null && !set.contains(w)) {
                set.add(w);
                map[c] = w;
                continue;
            } else if (map[c] != null && map[c].equals(w)) {
                continue;
            }
            return false;
        }
        return patternIndex == pattern.length() && charIndex >= s.length();
    }
}
