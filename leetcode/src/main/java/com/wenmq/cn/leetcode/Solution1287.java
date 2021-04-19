package com.wenmq.cn.leetcode;

/**
 * Q1287
 * https://leetcode-cn.com/problems/element-appearing-more-than-25-in-sorted-array/
 */
public class Solution1287 {
    /**
     * 1 <= arr.length <= 10^4
     * 0 <= arr[i] <= 10^5
     */
    public int findSpecialInteger(int[] arr) {
        int i = 0;
        int len = arr.length / 4;
        while (arr[i] != arr[i + len]) {
            i++;
        }
        return arr[i];
    }

}
