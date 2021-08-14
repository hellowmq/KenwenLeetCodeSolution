package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/delete-characters-to-make-fancy-string/">
 * Q1957
 * </a>
 */
public class Solution1957 {
    /**
     * 1 <= s.length <= 10^5
     * s 只包含小写英文字母。
     */
    public String makeFancyString(String s) {
        if (s == null || s.length() < 3) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.length());
        char pre = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (pre != cur) {
                pre = cur;
                count = 1;
                sb.append(cur);
            } else {
                if (count < 2) {
                    count++;
                    sb.append(cur);
                }
            }
        }
        return sb.toString();
    }

    /**
     * 直接基于数组
     */
    public String makeFancyString2(String s) {
        char[] chars = s.toCharArray();
        char pre = 0;
        int now = 0;
        int count = 0;
        for (char cur : chars) {
            if (pre != cur) {
                pre = cur;
                count = 1;
                chars[now++] = cur;
            } else if (count < 2) {
                count++;
                chars[now++] = cur;
            }
        }
        return String.valueOf(chars, 0, now);
    }

    /**
     * 提交信息里比较高效的一个解答
     */
    public String makeFancyString3(String s) {
        char[] cs = s.toCharArray();
        char c = cs[0];
        int count = 1;
        int index = 1;
        for (int i = 1; i < cs.length; i++) {
            if (cs[i] == c) {
                if (count != 2) {
                    count++;
                } else {
                    continue;
                }
            } else {
                c = cs[i];
                count = 1;
            }
            cs[index++] = cs[i];
        }
        return new String(cs, 0, index);
    }

}
