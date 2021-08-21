package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/corporate-flight-bookings/">
 * Q1109
 * </a>
 */
public class Solution1109 {
    /**
     * 1 <= n <= 2 * 10^4
     * 1 <= bookings.length <= 2 * 10^4
     * bookings[i].length == 3
     * 1 <= first_i <= last_i <= n
     * 1 <= seats_i <= 10^4
     */
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n + 1];
        for (int[] booking : bookings) {
            nums[booking[0] - 1] += booking[2];
            nums[booking[1]] -= booking[2];
        }
        for (int i = 0; i < n; i++) {
            nums[i + 1] += nums[i];
        }
        return Arrays.copyOf(nums, n);
    }

    public int[] corpFlightBookings2(int[][] bookings, int n) {
        int[] nums = new int[n];
        for (int[] booking : bookings) {
            nums[booking[0] - 1] += booking[2];
            if (booking[1] != n) {
                nums[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}
