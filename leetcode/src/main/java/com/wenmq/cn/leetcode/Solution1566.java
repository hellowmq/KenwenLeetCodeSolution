
package com.wenmq.cn.leetcode;

/**
 * Q1566
 * https://leetcode-cn.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
 */
public class Solution1566 {
    /**
     * 2 <= arr.length <= 100
     * 1 <= arr[i] <= 100
     * 1 <= m <= 100
     * 2 <= k <= 100
     */
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i < arr.length; i++) {
            int j = m * k + i;
            int p = i + m;
            if (j > arr.length) {
                break;
            }
            while (p < j && arr[p - m] == arr[p]) {
                p++;
            }
            if (p == j) {
                return true;
            }
        }
        return false;
    }
}
