package com.wenmq.leetcode;

/**
 * Q283
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class Solution283 {

    /**
     * 从左至右一直遍历，右边所有数置零即可
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int indexOfNotZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            nums[indexOfNotZero] = nums[i];
            indexOfNotZero++;
        }
        for (int i = indexOfNotZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
