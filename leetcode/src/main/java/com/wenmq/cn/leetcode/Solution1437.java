package com.wenmq.cn.leetcode;

/**
 * Q1437
 * https://leetcode-cn.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
 */
public class Solution1437 {
    /**
     * 1 <= nums.length <= 10^5
     * 0 <= k <= nums.length
     * nums[i] 的值为 0 或 1
     */
    public boolean kLengthApart(int[] nums, int k) {
        if (k == 0) {
            return true;
        }
        int res = 0;
        for (int num : nums) {
            if (num == 0) {
                res--;
                continue;
            }
            if (res > 0) {
                return false;
            }
            res = k;
        }
        return true;
    }
}
