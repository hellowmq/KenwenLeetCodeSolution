package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1403
 * https://leetcode-cn.com/problems/minimum-subsequence-in-non-increasing-order/
 */
public class Solution1403 {
    /**
     * 1 <= nums.length <= 500
     * 1 <= nums[i] <= 100
     */
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        int[] tmp = new int[101];
        for (int num : nums) {
            sum += num;
            tmp[num]++;
        }
        int a = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 100; i >= 0; i--) {
            while (tmp[i] > 0) {
                ans.add(i);
                a += i;
                tmp[i]--;
                if (a > sum - a) {
                    return ans;
                }
            }
        }
        return ans;
    }
}