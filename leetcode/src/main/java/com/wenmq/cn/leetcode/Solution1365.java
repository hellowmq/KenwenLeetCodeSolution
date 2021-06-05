package com.wenmq.cn.leetcode;

/**
 * Q1365
 * https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class Solution1365 {
    /**
     * 方法一：
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[102];
        for (int num : nums) {
            counts[num + 1]++;
        }
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        int[] lessThan = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            lessThan[i] = counts[nums[i]];
        }
        return lessThan;
    }

}
