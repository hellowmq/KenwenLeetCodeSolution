package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q452
 * https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> (Integer.compare(a[1], b[1])));
        int end = points[0][1];
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (end >= points[i][0]) {
                continue;
            }
            end = points[i][1];
            count++;
        }
        return count;
    }


}
