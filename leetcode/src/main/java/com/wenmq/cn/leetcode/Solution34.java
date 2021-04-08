package com.wenmq.cn.leetcode;

/**
 * Q34
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class Solution34 {
    /**
     * 方法一：
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] ans = new int[]{-1, -1};
        divide(0, nums.length - 1, nums, target, ans);
        return ans;
    }

    /**
     * divide
     */
    public static void divide(int l, int r, int[] nums, int target, int[] ans) {
        if (nums[l] == target && ans[0] == -1) {
            ans[0] = l;
        }
        if (nums[r] == target && ans[1] < r) {
            ans[1] = r;
        }
        if (l == r) {
            return;
        }
        int mid = (l + r) / 2;
        if (nums[mid] >= target && nums[l] <= target) {
            divide(l, mid, nums, target, ans);
        }
        if (nums[r] >= target && nums[mid + 1] <= target) {
            divide(mid + 1, r, nums, target, ans);
        }
    }


}
