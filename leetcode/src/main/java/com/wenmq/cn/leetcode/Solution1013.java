package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/">
 * Q1013
 * </a>
 */
public class Solution1013 {
    /**
     * 3 <= arr.length <= 5 * 10^4
     * -10^4 <= arr[i] <= 10^4
     */
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int target = sum / 3;
        sum = 0;
        int cnt = 0;
        for (int n : arr) {
            sum += n;
            if (sum == target) {
                sum = 0;
                cnt++;
            }
        }
        return cnt >= 3;
    }
}
