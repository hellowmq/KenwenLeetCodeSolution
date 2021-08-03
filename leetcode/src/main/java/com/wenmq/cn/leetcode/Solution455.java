package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q455
 * https://leetcode-cn.com/problems/assign-cookies/
 */
public class Solution455 {
    /**
     * 1 <= g.length <= 3 * 10^4
     * 0 <= s.length <= 3 * 10^4
     * 1 <= g[i], s[j] <= 2^31 - 1
     */
    public int findContentChildren(int[] g, int[] s) {
        int child = 0;
        int cookie = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (child < g.length && cookie < s.length) { //当其中一个遍历就结束
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;
    }

}
