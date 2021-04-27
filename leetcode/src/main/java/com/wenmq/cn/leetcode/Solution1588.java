package com.wenmq.cn.leetcode;

/**
 * Q1588
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 */
public class Solution1588 {
    /**
     * 1 <= arr.length <= 100
     * 1 <= arr[i] <= 1000
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]
                    * ((i / 2 + 1) * ((n - i - 1) / 2 + 1)
                    + ((i + 1) / 2) * ((n - i) / 2));
        }
        return sum;
    }

}
