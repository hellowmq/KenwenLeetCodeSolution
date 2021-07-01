package com.wenmq.cn.leetcode;

/**
 * Q551
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 */
public class Solution551 {
    /**
     * 'A' : Absent，缺勤
     * 'L' : Late，迟到
     * 'P' : Present，到场
     */
    public boolean checkRecord(String s) {
        int a = s.indexOf('A');
        if (a >= 0 && s.indexOf('A', a + 1) > 0) {
            return false;
        }
        return !s.contains("LLL");
    }

}
