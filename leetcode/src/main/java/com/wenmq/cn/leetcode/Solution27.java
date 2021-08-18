package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/remove-element/">
 * Q27
 * </a>
 */
public class Solution27 {
    /**
     * 0 <= nums.length <= 100
     * 0 <= nums[i] <= 50
     * 0 <= val <= 100
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }


}
