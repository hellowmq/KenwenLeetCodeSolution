package com.wenmq.cn.leetcode;

/**
 * Q1523
 * https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/
 */
public class Solution1523 {
    /**
     * 0 <= low <= high <= 10^9
     */
    public int countOdds(int low, int high) {
        int upperBound = (high + 1) >> 1;
        int lowerBound = low >> 1;
        return upperBound - lowerBound;
    }

}
