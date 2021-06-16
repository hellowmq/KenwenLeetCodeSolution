package com.wenmq.cn.leetcode;

/**
 * Q1646
 * https://leetcode-cn.com/problems/get-maximum-in-generated-array
 */
public class Solution1646 {

    /**
     * DP 法
     * 0 <= n <= 100
     */
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];

        if (n < 2) {
            return n;
        }
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
