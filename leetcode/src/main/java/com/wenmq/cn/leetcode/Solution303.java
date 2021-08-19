package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/range-sum-query-immutable/">
 * Q303
 * </a>
 */
public class Solution303 {
    /**
     * 0 <= nums.length <= 104
     * -10^5<= nums[i] <= 10^5
     * 0 <= i <= j < nums.length
     * 最多调用 10^4 次 sumRange 方法
     */
    static class NumArray {
        public int[] mNums;
        public int[] mRes;

        public NumArray(int[] nums) {
            this.mNums = nums;
            this.mRes = new int[nums.length];
            if (nums.length != 0) {
                mRes[0] = nums[0];
                for (int i = 1; i < mRes.length; i++) {
                    mRes[i] = mRes[i - 1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            return i == 0 ? mRes[j] : mRes[j] - mRes[i - 1];
        }
    }

    /**
     * 优化方法复杂度
     */
    static class NumArray2 {
        public int[] mNums;
        public int[] mRes;

        public NumArray2(int[] nums) {
            this.mNums = nums;
            this.mRes = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                mRes[i + 1] = mRes[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return mRes[j + 1] - mRes[i];
        }
    }


}
