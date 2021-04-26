package com.wenmq.cn.leetcode;

/**
 * Q1550
 * https://leetcode-cn.com/problems/three-consecutive-odds/
 */
public class Solution1550 {
    /**
     * 1 <= arr.length <= 1000
     * 1 <= arr[i] <= 1000
     */
    public boolean threeConsecutiveOdds(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            if ((value & 1) == 1) {
                sum += 1;
                if (sum == 3) {
                    return true;
                }
            } else {
                sum = 0;
            }
        }
        return false;
    }

}
