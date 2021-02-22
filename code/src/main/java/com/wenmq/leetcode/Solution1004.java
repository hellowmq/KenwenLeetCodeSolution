package com.wenmq.leetcode;

/**
 * Q1004
 * https://leetcode-cn.com/problems/max-consecutive-ones-iii/
 */
public class Solution1004 {

    public int longestOnes(int[] A, int K) {
        int right = 0;
        int left = 0;
        int res = 0;
        while (left < A.length) {
            if (A[left] == 0) {
                if (K == 0) {
                    while (A[right] == 1) {
                        right++;
                    }
                    right++;
                } else {
                    K--;
                }
            }
            res = Math.max(res, ++left - right);
        }
        return res;
    }


}
