package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-window-substring/">
 * Q76
 * </a>
 */
public class Solution76 {
    /**
     * 1 <= s.length, t.length <= 10^5
     * s 和 t 由英文字母组成
     */
    String minWindow(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int countNeed = 0;
        for (int a : need) {
            if (a > 0) {
                countNeed++;
            }
        }

        int left = 0;
        int right = 0;
        int valid = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0;
        int len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新
            if (need[c] >= 0) {
                window[c]++;
                if (window[c] == need[c]) {
                    valid++;
                }
            }

            // 判断左侧窗口是否要收缩
            while (valid == countNeed) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 左移窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need[d] >= 0) {
                    if (window[d] == need[d]) {
                        valid--;
                    }
                    window[d]--;
                }
            }
        }
        // 返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    String minWindow2(String s, String t) {
        int[] need = new int[128];
        char[] tChars = t.toCharArray();
        for (char c : tChars) {
            need[c]--;
        }
        int left = 0;
        int right = 0;
        int valid = 0;
        for (int n : need) {
            if (n != 0) {
                valid--;
            }
        }
        // 记录最小覆盖子串的起始索引及长度
        int start = 0;
        int len = Integer.MAX_VALUE;
        char[] sChars = s.toCharArray();
        while (right < sChars.length) {
            // c 是将移入窗口的字符
            char c = sChars[right];
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新
            need[c]++;
            if (need[c] == 0) {
                valid++;
            }

            // 判断左侧窗口是否要收缩
            while (valid == 0) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗口的字符
                char d = sChars[left];
                // 左移窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need[d] == 0) {
                    valid--;
                }
                need[d]--;
            }
        }
        // 返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : String.valueOf(sChars, start, len);
    }

//    TEMPLATE
//    /* 滑动窗口算法框架 */
//    void slidingWindow(string s, string t) {
//        unordered_map<char, int> need, window;
//        for (char c : t) need[c]++;
//
//        int left = 0, right = 0;
//        int valid = 0;
//        while (right < s.size()) {
//            // c 是将移入窗口的字符
//            char c = s[right];
//            // 右移窗口
//            right++;
//            // 进行窗口内数据的一系列更新
//        ...
//
//            /*** debug 输出的位置 ***/
//            printf("window: [%d, %d)\n", left, right);
//            /********************/
//
//            // 判断左侧窗口是否要收缩
//            while (window needs shrink) {
//                // d 是将移出窗口的字符
//                char d = s[left];
//                // 左移窗口
//                left++;
//                // 进行窗口内数据的一系列更新
//            ...
//            }
//        }
//    }

}
