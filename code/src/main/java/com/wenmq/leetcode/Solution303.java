package com.wenmq.leetcode;

/**
 * Q303
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class Solution303 {
    /**
     * 方法一：
     */
    static class NumArray {
        public int[] nums;
        public int[] res ;
        public NumArray(int[] nums) {
            this.nums = nums;
            this.res = new int[nums.length];
            if(nums.length == 0) return ;
            res[0] = nums[0];
            for(int i=1;i<res.length;i++){
                res[i] = res[i-1] + nums[i];

            }
        }

        public int sumRange(int i, int j) {
            if(i == 0) return res[j];
            return res[j] - res[i-1];
        }
    }


}
