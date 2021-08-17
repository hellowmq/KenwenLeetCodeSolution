package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/build-array-from-permutation/">
 * Q1920
 * </a>
 */
public class Solution1920 {
    /**
     * 1 <= nums.length <= 1000
     * 0 <= nums[i] < nums.length
     * nums 中的元素 互不相同
     */
    public int[] buildArray(int[] nums) {
        int [] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }

}
