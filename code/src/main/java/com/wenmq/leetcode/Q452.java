package com.wenmq.leetcode;

import java.util.Arrays;

/**
 * Q452
 * https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class Q452 {
    static class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0) return 0;
            Arrays.sort(points, (a, b) -> (Integer.compare(a[1], b[1])));
            int end = points[0][1];
            int count = 1;
            for (int i = 1; i < points.length; i++) {
                if (end >= points[i][0])
                    continue;
                end = points[i][1];
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //[10,16],[2,8],[1,6],[7,12]]
        int[][] points0 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}}; // 2
        int[][] points1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}}; // 4
        int[][] points2 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}}; //2
        int[][] points3 = {{1, 2}}; // 1
        int[][] points4 = {{2, 3}, {2, 3}}; // 1
        System.out.println(solution.findMinArrowShots(points0));
        System.out.println(solution.findMinArrowShots(points1));
        System.out.println(solution.findMinArrowShots(points2));
        System.out.println(solution.findMinArrowShots(points3));
        System.out.println(solution.findMinArrowShots(points4));
        int[][] errorCase = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        System.out.println(solution.findMinArrowShots(errorCase));

    }

}
