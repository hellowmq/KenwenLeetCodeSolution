package com.wenmq.leetcode;

/**
 * Q1006
 * https://leetcode-cn.com/problems/clumsy-factorial/
 */
public class Solution1006 {
    /**
     * 找规律
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public int clumsy(int N) {
        switch (N) {
            case 0:
            case 1:
            case 2:
                return N;
            case 3:
                return 6;
            case 4:
                return 7;
            default:
                // ignore;
        }
        switch (N % 4) {
            case 0:
                return N + 1;
            case 1:
            case 2:
                return N + 2;
            default:
                return N - 1;
        }
    }
}
