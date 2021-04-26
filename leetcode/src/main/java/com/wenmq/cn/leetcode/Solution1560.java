package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1560
 * https://leetcode-cn.com/problems/most-visited-sector-in-a-circular-track/
 */
public class Solution1560 {
    /**
     * 2 <= n <= 100
     * 1 <= m <= 100
     * rounds.length == m + 1
     * 1 <= rounds[i] <= n
     * rounds[i] != rounds[i + 1] ，其中 0 <= i < m
     */
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> res = new ArrayList<>();
        int len = rounds.length;
        int left = rounds[0];
        int right = rounds[len - 1];
        if (right < left) {
            for (int i = 1; i <= right; i++) {
                res.add(i);
            }
            for (int i = left; i <= n; i++) {
                res.add(i);
            }
        } else {
            for (int i = left; i <= right; i++) {
                res.add(i);
            }
        }
        return res;
    }
}
