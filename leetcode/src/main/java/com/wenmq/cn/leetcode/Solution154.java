package com.wenmq.cn.leetcode;

/**
 * Q
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution154 {
    /**
     * 和 I 的做法类似, 都是二分法, 每次进入无序的那部分找出最小值
     * 但是由于有重复值的情况, 需要加入 mid 元素等于 hi 元素的情况
     * 此时应该将 hi 减 1 防止重复数字是最小元素
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                high--;
            }
        }
        return nums[low];
    }

}
