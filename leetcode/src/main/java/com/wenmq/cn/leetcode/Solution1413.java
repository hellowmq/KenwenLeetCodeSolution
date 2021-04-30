package com.wenmq.cn.leetcode;

/**
 * Q1413
 * https://leetcode-cn.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 */
public class Solution1413 {
    /**
     * 边累加边计算最小累加和
     * 返回 1 - min
     */
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }
        return 1 - min;
    }

}
