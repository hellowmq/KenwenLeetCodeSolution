package com.wenmq.cn.leetcode;

/**
 * Q852
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class Solution852 {
    /**
     * 二分法
     * 源于 Arrays binarySearch 修改
     * <p>
     * 3 <= arr.length <= 104
     * 0 <= arr[i] <= 106
     * 题目数据保证 arr 是一个山脉数组
     * arr.length >= 3
     * i（0 < i < arr.length - 1）
     */
    public int peakIndexInMountainArray(int[] arr) {
        int search = 0;
        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < arr[mid + 1]) {
                low = mid + 1;
            } else if (midVal < arr[mid - 1]) {
                high = mid - 1;
            } else {
                search = mid;
                break;
                // key found
            }
        }
        return search;
    }

}
