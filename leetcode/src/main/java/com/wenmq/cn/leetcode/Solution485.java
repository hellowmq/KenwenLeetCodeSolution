package com.wenmq.cn.leetcode;

/**
 * Q485
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 */
public class Solution485 {
    /**
     * 输入的数组只包含 0 和 1 。
     * 输入数组的长度是正整数，且不超过 10,000。
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int start = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, i - start);
                start = i + 1;
            }
        }
        return Math.max(max, n - start);
    }
}
