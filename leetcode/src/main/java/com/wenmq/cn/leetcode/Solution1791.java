package com.wenmq.cn.leetcode;

/**
 * Q1791
 * https://leetcode-cn.com/problems/find-center-of-star-graph/
 */
public class Solution1791 {
    /**
     * 3 <= n <= 10^5
     * edges.length == n - 1
     * edges[i].length == 2
     * 1 <= u_i, v_i <= n
     * u_i != v_i
     */
    public int findCenter(int[][] edges) {
        int[] set = new int[0x1FFFF];
        for (int[] edge : edges) {
            for (int node : edge) {
                int i = node >> 5;
                int v = 1 << (node & 31);
                if ((set[i] & v) == 0) {
                    set[i] |= v;
                } else {
                    return node;
                }
            }
        }
        return 0;
    }

    public int findCenter2(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }

}
