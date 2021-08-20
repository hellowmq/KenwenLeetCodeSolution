package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/car-pooling/">
 * Q1094
 * </a>
 */
public class Solution1094 {
    /**
     * 你可以假设乘客会自觉遵守 “先下后上” 的良好素质
     * trips.length <= 1000
     * trips[i].length == 3
     * 1 <= trips[i][0] <= 100
     * 0 <= trips[i][1] < trips[i][2] <= 1000
     * 1 <= capacity <= 100000
     */
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];
        for (int[] trip : trips) {
            int i = trip[0];
            diff[trip[1]] += i;
            diff[trip[2]] -= i;
        }
        for (int trip : diff) {
            if (capacity >= 0) {
                capacity -= trip;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 先找出最远点，避免数组空间过大
     * 针对 bad case 加速运行
     */
    public boolean carPooling2(int[][] trips, int capacity) {
        int max = 0;
        for (int[] trip : trips) {
            if (max < trip[2]) {
                max = trip[2];
            }
        }
        int[] diff = new int[max + 1];
        for (int[] trip : trips) {
            diff[trip[1]] -= trip[0];
            diff[trip[2]] += trip[0];
        }
        for (int trip : diff) {
            if (capacity < 0) {
                return false;
            } else {
                capacity += trip;
            }
        }
        return true;
    }
}
