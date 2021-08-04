package com.wenmq.cn.leetcode;

/**
 * Q453
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 */
public class Solution453 {
    /**
     * 先找出最小值
     */
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            sum += num - min;
        }
        return sum;
    }

    /**
     * 一次遍历
     */
    public int minMoves2(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                sum += (min - nums[i]) * i;
                min = nums[i];
            } else {
                sum += nums[i] - min;
            }
        }
        return sum;
    }
}
