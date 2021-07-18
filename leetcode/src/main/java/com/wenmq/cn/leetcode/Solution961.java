package com.wenmq.cn.leetcode;

/**
 * Q961
 * https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/
 */
public class Solution961 {

    private static final int MAX_LENGTH = 10001;

    /**
     * 4 <= A.length <= 10000
     * 0 <= A[i] < 10000
     * A.length 为偶数
     * -----------------
     * 重复的元素就是目标数
     */
    public int repeatedNTimes(int[] nums) {
        int[] set = new int[313];
        for (int num : nums) {
            int num1 = num;
            int index = num >> 5;
            num1 &= 0x1F;
            if ((set[index] & (1 << num1)) == 0) {
                set[index] |= (1 << num);
            } else {
                return num;
            }
        }
        return 0;
    }

    /**
     * 寻找重复元素碰撞的情况
     */
    public int repeatedNTimes2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        if (nums[0] == nums[2] || nums[0] == nums[nums.length - 1]) {
            return nums[0];
        }
        return nums[1];
    }

}
