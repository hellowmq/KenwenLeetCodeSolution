package com.wenmq.leetcode;

/**
 * Q1438
 * https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
 */
public class Solution1438 {
    /**
     * 方法一：
     */
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int[] maxq = new int[n], minq = new int[n];
        int hh1 = 0, tt1 = -1, hh2 = 0, tt2 = -1;
        int l = 0, r = 0;

        int res = 0;
        while(r < n){
            while(hh1 <= tt1 && nums[maxq[tt1]] < nums[r])  tt1--;
            while(hh2 <= tt2 && nums[minq[tt2]] > nums[r])  tt2--;
            maxq[++tt1] = r;
            minq[++tt2] = r;
            r++;
            while(nums[maxq[hh1]] - nums[minq[hh2]] > limit){
                l++;
                if(l > maxq[hh1])   hh1++;
                if(l > minq[hh2])   hh2++;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }

}
