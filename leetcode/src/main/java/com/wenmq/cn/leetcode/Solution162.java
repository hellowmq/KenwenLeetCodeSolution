package com.wenmq.cn.leetcode;

/**
 * Q162
 * https://leetcode-cn.com/problems/find-peak-element/
 */
public class Solution162 {
    /**
     * 二分法求极值
     */
    public int findPeakElement(int[] nums) {
        int left = 0;
        for (int right = nums.length - 1; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}
