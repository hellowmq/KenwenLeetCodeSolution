package com.wenmq.cn.leetcode;

/**
 * Q1470
 * https://leetcode-cn.com/problems/shuffle-the-array/
 */
public class Solution1470 {
    /**
     * 1 <= n <= 500
     * nums.length == 2n
     * 1 <= nums[i] <= 10^3
     */
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[n << 1];
        for (int i = 0; i < n; i++) {
            array[2 * i] = nums[i];
            array[2 * i + 1] = nums[n + i];
        }
        return array;
    }

}
