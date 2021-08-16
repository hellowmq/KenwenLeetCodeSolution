package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/concatenation-of-array/">
 * Q1929
 * </a>
 */
public class Solution1929 {
    /**
     * n == nums.length
     * 1 <= n <= 1000
     * 1 <= nums[i] <= 1000
     */
    public int[] getConcatenation(int[] nums) {
        int[] ints = new int[nums.length << 1];
        System.arraycopy(nums, 0, ints, 0, nums.length);
        System.arraycopy(nums, 0, ints, nums.length, nums.length);
        return ints;
    }

}
