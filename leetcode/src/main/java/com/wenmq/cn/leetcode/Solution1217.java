package com.wenmq.cn.leetcode;

/**
 * Q1217
 * https://leetcode-cn.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 */
public class Solution1217 {
    /**
     * 1 <= chips.length <= 100
     * 1 <= chips[i] <= 10^9
     */
    public int minCostToMoveChips(int[] position) {
        int a = 0;
        for (int pos : position) {
            a += pos & 1;
        }
        return Math.min(a, position.length - a);
    }

}
