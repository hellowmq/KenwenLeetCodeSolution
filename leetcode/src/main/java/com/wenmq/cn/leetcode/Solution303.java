package com.wenmq.cn.leetcode;

/**
 * Q303
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class Solution303 {
    /**
     * 0 <= nums.length <= 104
     * -10^5<= nums[i] <= 10^5
     * 0 <= i <= j < nums.length
     * 最多调用 10^4 次 sumRange 方法
     *
     */
    static class NumArray {
        public int[] nums;
        public int[] res;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.res = new int[nums.length];
            if (nums.length == 0) {
                return;
            }
            res[0] = nums[0];
            for (int i = 1; i < res.length; i++) {
                res[i] = res[i - 1] + nums[i];

            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return res[j];
            }
            return res[j] - res[i - 1];
        }
    }


}
