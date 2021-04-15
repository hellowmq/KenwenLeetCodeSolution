package com.wenmq.cn.leetcode;

/**
 * Q1624
 * https://leetcode-cn.com/problems/largest-substring-between-two-equal-characters/
 */
public class Solution1624 {
    /**
     * 1 <= s.length <= 300
     * s 只含小写英文字母
     */
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }
        int len = -1;
        for (int i = 0; i < map.length; i++) {
            if (map[i] < 2) {
                continue;
            }
            len = Math.max(len, s.lastIndexOf(i + 'a') - s.indexOf(i + 'a') - 1);
        }
        return len;
    }

    /**
     * 1 <= s.length <= 300
     * s 只含小写英文字母
     */
    public int maxLengthBetweenEqualCharacters2(String s) {
        int set = 0;
        int len = -1;
        for (int i = 0; i < s.length(); i++) {
            if ((set & (1 << (s.charAt(i) - 'a'))) != 0) {
                continue;
            }
            len = Math.max(len, s.lastIndexOf(s.charAt(i)) - i - 1);
            set |= (1 << (s.charAt(i) - 'a'));
        }
        return len;
    }

}
