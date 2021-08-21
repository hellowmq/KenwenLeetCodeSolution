package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/string-compression/">
 * Q443
 * </a>
 */
public class Solution443 {
    /**
     * 1 <= chars.length <= 2000
     * chars[i] 可以是小写英文字母、大写英文字母、数字或符号
     */
    public int compress(char[] chars) {
        int len = 0;
        int fast = 0;
        int cnt = 1;
        while (fast < chars.length) {
            if (fast != chars.length - 1 && chars[fast] == chars[fast + 1]) {
                fast++;
                cnt++;
                continue;
            }
            chars[len++] = chars[fast];
            len = appendCnt(chars, len, cnt);
            cnt = 1;
            fast++;
        }
        return len;
    }

    private int appendCnt(char[] chars, int len, int cnt) {
        if (cnt > 1) {
            len += stringSize(cnt);
            int start = len;
            while (cnt > 0) {
                chars[--start] = (char) ('0' + cnt % 10);
                cnt /= 10;
            }
        }
        return len;
    }

    private int stringSize(int x) {
        int a = 0;
        while (x > 0) {
            a++;
            x /= 10;
        }
        return a;
    }
}
