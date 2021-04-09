package com.wenmq.cn.leetcode;

/**
 * Q1779
 * https://leetcode-cn.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
 */
public class Solution1779 {
    /**
     * 1 <= points.length <= 10^4
     * points[i].length == 2
     * 1 <= x, y, ai, bi <= 10^4
     */
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] != x && points[i][1] != y) {
                continue;
            }

            int distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
            if (distance >= min) {
                continue;
            }
            min = distance;
            index = i;
        }
        return index;
    }

}
