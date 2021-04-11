package com.wenmq.cn.leetcode;

/**
 * Q1752
 * https://leetcode-cn.com/problems/check-if-array-is-sorted-and-rotated/
 */
public class Solution1752 {
    /**
     * 问题等价于
     * 顺序遍历，仅存在一次逆序
     */
    public boolean check(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums[(i + 1) % nums.length]) {
                continue;
            }
            if (flag) {
                return false;
            }
            flag = true;
        }
        return true;
    }

}
