package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q561
 * https://leetcode-cn.com/problems/array-partition-i/
 */
public class Solution561 {
    /**
     * 所有的对于集合中任意两对数若存在 a <= b <= c <= d
     * 其最优分布为 {a,b}, {c,d}
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        return count;
    }
}
