package com.wenmq.cn.leetcode;

/**
 * Q26
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution26 {
    /**
     * 0 <= nums.length <= 3 * 10^4
     * -10^4 <= nums[i] <= 10^4
     * nums 已按升序排列
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }


    /**
     * while loop
     */
    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != nums[left] && left++ != right) {
                nums[left] = nums[right];
            }
            right++;
        }
        return ++left;
    }

}
