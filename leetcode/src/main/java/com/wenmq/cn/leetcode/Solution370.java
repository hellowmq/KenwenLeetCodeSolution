package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/range-addition/">
 * Q370
 * </a>
 */
public class Solution370 {
    /**
     * 返回 k 次操作后的数组
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] nums = new int[length];
        for (int[] update : updates) {
            int i = update[2];
            nums[update[0]] += i;
            if (update[1] < length - 1) {
                nums[update[1] + 1] -= i;
            }
        }
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }


    public int[] getModifiedArray2(int length, int[][] updates) {
        int[] nums = new int[length + 1];
        for (int[] update : updates) {
            nums[update[0]] += update[2];
            nums[update[1] + 1] -= update[2];
        }
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i - 1];
        }
        return Arrays.copyOf(nums, length);
    }
}
