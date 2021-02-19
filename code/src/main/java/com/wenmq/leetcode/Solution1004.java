package com.wenmq.leetcode;

/**
 * Q1004
 * https://leetcode-cn.com/problems/max-consecutive-ones-iii/
 */
public class Solution1004 {

    public int longestOnes(int[] A, int K) {
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < A.length) {
            if (A[right] != 0) {
                res = Math.max(res, ++right - left);
                continue;
            }
            if (K == 0) {
                while (A[left] == 1) {
                    left++;
                }
                left++;
            } else {
                K--;
            }
            res = Math.max(res, ++right - left);
        }
        return res;
    }


}
