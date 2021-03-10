package com.wenmq.leetcode;

/**
 * Q747
 * https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
 */
public class Solution747 {
    /**
     * 方法一：
     */
    public int dominantIndex(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max = -1;
        int second = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] >= second) {
                second = nums[i];
            }
        }
        return (max >= second * 2) ? index : -1;
    }

}
