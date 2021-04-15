package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q1636
 * https://leetcode-cn.com/problems/sort-array-by-increasing-frequency/
 */
public class Solution1636 {
    /**
     * 1 <= nums.length <= 100
     * -100 <= nums[i] <= 100
     */
    public int[] frequencySort(int[] nums) {
        int[] counts = new int[201];
        for (int n : nums) {
            counts[n + 100]++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (counts[nums[i] + 100] << 8) + (100 - nums[i]);
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 100 - (nums[i] & 0xFF);
        }

        return nums;
    }

}