package com.wenmq.cn.leetcode;

/**
 * Q1232
 * https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 */
public class Solution1232 {
    /**
     * 运用向量来理解
     * 以第一个点为原点
     * 先确定一个初始向量 (xi, yi)
     * 判断其余向量是否与之共线 <=> 向量内积为零
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int xi = coordinates[1][0] - coordinates[0][0];
        int yi = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int xj = coordinates[i][0] - coordinates[0][0];
            int yj = coordinates[i][1] - coordinates[0][1];
            if (((long) xi) * yj - ((long) xj) * yi != 0) {
                return false;
            }
        }
        return true;
    }

}
