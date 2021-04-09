package com.wenmq.cn.leetcode;

/**
 * Q1037
 * https://leetcode-cn.com/problems/valid-boomerang/
 */
public class Solution1037 {
    /**
     * 向量不共线判断的等价条件
     * 这个不需要依赖于两点重合
     */
    public boolean isBoomerang(int[][] points) {
        int x01 = points[1][0] - points[0][0];
        int y01 = points[1][1] - points[0][1];
        int y02 = points[2][1] - points[0][1];
        int x02 = points[2][0] - points[0][0];
        return x01 * y02 != x02 * y01;
    }

}
