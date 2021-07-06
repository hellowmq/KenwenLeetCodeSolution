package com.wenmq.cn.leetcode;

/**
 * Q704
 * https://leetcode-cn.com/problems/binary-search/
 */
public class Solution704 {
    /**
     * 你可以假设 nums 中的所有元素是不重复的。
     * n 将在 [1, 10^4]之间。
     * nums 的每个元素都将在 [-9999, 9999]之间。
     * 从 Arrays.binarySearch 中引入
     */
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal >= target) {
                if (midVal <= target) {
                    return mid; // key found
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;  // key not found.
    }

}
