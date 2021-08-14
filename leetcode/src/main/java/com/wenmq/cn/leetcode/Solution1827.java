package com.wenmq.cn.leetcode;

/**
 * Q1827
 * https://leetcode-cn.com/problems/minimum-operations-to-make-the-array-increasing/
 */
public class Solution1827 {
    /**
     * 1 <= nums.length <= 5000
     * 1 <= nums[i] <= 10^4
     */
    public int minOperations(int[] nums) {
        int count = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= max) {
                count += max - nums[i] + 1;
                max++;
            } else {
                max = nums[i];
            }
        }
        return count;
    }

    public int minOperations2(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = (num > max) ? num : (max + 1);
            count += max - num;
        }
        return count;
    }
}
