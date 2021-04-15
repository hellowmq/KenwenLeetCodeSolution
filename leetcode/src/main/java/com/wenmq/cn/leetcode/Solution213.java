package com.wenmq.cn.leetcode;

/**
 * Q213
 * https://leetcode-cn.com/problems/house-robber-ii/
 */
public class Solution213 {
    /**
     * 非常经典的DP
     */
    public int rob(int[] nums) {
        return Math.max(rob1(nums, 0, nums.length - 2), rob1(nums, 1, nums.length - 1));
    }

    public int rob1(int[] nums, int start, int end) {
        int dp1 = 0;
        int dp2 = 0;
        int bp = nums[0];
        for (int i = end; i >= start; i--) {
            bp = Math.max(nums[i] + dp2, dp1);
            dp2 = dp1;
            dp1 = bp;
        }
        return bp;
    }

}
