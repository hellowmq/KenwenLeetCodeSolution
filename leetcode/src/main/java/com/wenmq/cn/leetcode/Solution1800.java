package com.wenmq.cn.leetcode;

/**
 * Q1800
 * https://leetcode-cn.com/problems/maximum-ascending-subarray-sum/
 */
public class Solution1800 {
    /**
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     */
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                // 中断了
                max = Math.max(max, temp);
                temp = nums[i];
            } else {
                // 保持升序
                temp += nums[i];
                max = Math.max(max, temp);
            }
        }
        return max;
    }

}
