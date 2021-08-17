package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-product-difference-between-two-pairs/">
 * Q1913
 * </a>
 */
public class Solution1913 {
    /**
     * 4 <= nums.length <= 10^4
     * 1 <= nums[i] <= 10^4
     */
    public int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE + 1;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE - 1;
        for (int n : nums) {
            if (n > max) {
                max2 = max;
                max = n;
            } else if (n > max2) {
                max2 = n;
            }
            if (n < min) {
                min2 = min;
                min = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return max * max2 - min * min2;
    }
}
