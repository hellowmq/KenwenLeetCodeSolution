package com.wenmq.cn.leetcode;

/**
 * Q1736
 * https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits
 */
public class Solution1736 {
    /**
     * time 的格式为 hh:mm
     * 题目数据保证你可以由输入的字符串生成有效的时间
     */
    public String maximumTime(String time) {
        char[] tmp = time.toCharArray();
        if (tmp[0] == '?') {
            if (tmp[1] == '?' || tmp[1] < '4') {
                tmp[0] = '2';
            } else {
                tmp[0] = '1';
            }
        }
        if (tmp[1] == '?') {
            if (tmp[0] == '2') {
                tmp[1] = '3';
            } else {
                tmp[1] = '9';
            }
        }
        if (tmp[3] == '?') {
            tmp[3] = '5';
        }
        if (tmp[4] == '?') {
            tmp[4] = '9';
        }
        return new String(tmp);
    }
}
