package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/">
 * Q1011
 * </a>
 */
public class Solution1011 {
    /**
     * 1 <= D <= weights.length <= 5 * 10^4
     * 1 <= weights[i] <= 500
     */
    public int shipWithinDays(int[] weights, int days) {
        int left = 1;
        for (int weight : weights) {
            left = Math.max(left, weight);
        }
        int right = left * weights.length / days + 2;
        while (left < right) {
            int mid = (right + left) >>> 1;
            if (costDays(weights, mid) > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    int costDays(int[] weights, int capacity) {
        int days = 1;
        int temp = 0;
        for (int weight : weights) {
            temp += weight;
            if (temp > capacity) {
                temp = weight;
                days++;
            }
        }
        return days;
    }

}
