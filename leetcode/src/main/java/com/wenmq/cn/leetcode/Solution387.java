package com.wenmq.cn.leetcode;

/**
 * Q387
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class Solution387 {
    /**
     * 方法一：9ms
     */
    public int firstUniqChar(String s) {
        int has = 0;
        int repeat = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            repeat |= has & (1 << (c - 'a'));
            has |= (1 << (c - 'a'));
        }
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (((~repeat) & has & (1 << (c - 'a'))) != 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 方法二
     */
    public int firstUniqChar2(String s) {
        int has = 0;
        int[] pos = new int[26];
        int repeat = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            repeat |= has & (1 << index);
            has |= (1 << index);
            pos[index] = i;
        }
        int min = s.length();
        for (int i = 0; i < pos.length; i++) {
            if (((~repeat) & has & (1 << i)) != 0) {
                if (min > pos[i]) {
                    min = pos[i];
                }
            }
        }
        return min < s.length() ? min : -1;
    }


    /**
     * firstUniqChar3
     */
    public int firstUniqChar3(String s) {
        if (s.length() <= 26) {
            int[] chars = new int[26];
            for (char c : s.toCharArray()) {
                chars[c - 'a'] += 1;
            }
            for (int i = 0; i < s.length(); ++i) {
                if (chars[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }
        }
        //只遍历26个字母，使用indexOf函数检查字符索引
        int result = -1;
        for (char c = 'a'; c <= 'z'; ++c) {
            int pre = s.indexOf(c);
            // s包含该字符并且只出现一次
            if (pre != -1 && pre == s.lastIndexOf(c)) {
                // 取最前面的位置
                result = (result == -1 || result > pre) ? pre : result;
            }
        }
        return result;
    }

}
