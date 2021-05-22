package com.wenmq.cn.leetcode;

/**
 * Q810
 * https://leetcode-cn.com/problems/chalkboard-xor-game/
 */
public class Solution810 {
    /**
     * 1 <= N <= 1000
     * 0 <= nums[i] <= 2^16
     */
    public boolean xorGame(int[] nums) {
        int sum = 0;
        for (int i : nums) sum ^= i;
        return sum == 0 || nums.length % 2 == 0;
    }

}
