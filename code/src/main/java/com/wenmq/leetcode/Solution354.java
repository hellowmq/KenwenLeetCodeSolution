package com.wenmq.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Q354
 * https://leetcode-cn.com/problems/russian-doll-envelopes/
 */
public class Solution354 {
    /**
     * 方法一：
     */
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0) {
            return 0;
        }
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int[] dp = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            dp[i] = 1;
        }
        int res = 1;
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (envelopes[j][0] < envelopes[i][0]
                        && envelopes[j][1] < envelopes[i][1]
                        && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    res = Math.max(res, dp[i]);
                }
            }
        }
        return res;
    }

    public int maxEnvelopes2(int[][] envelopes) {
        int n = envelopes.length;
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int[] height = new int[n];
        for (int i = 0; i < n; ++i) {
            height[i] = envelopes[i][1];
        }

        int[] top = new int[n];
        int piles = 0;

        for (int i = 0; i < n; ++i) {
            int poker = height[i];
            int left = 0, right = piles - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (top[mid] > poker) {
                    right = mid - 1;
                } else if (top[mid] < poker) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (left == piles)
                piles++;
            top[left] = poker;
        }

        return piles;
    }


}
