package com.wenmq.cn.leetcode;

/**
 * Q26
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/comments/
 */
public class Solution26 {
    /**
     * 0 <= nums.length <= 3 * 104
     * -104 <= nums[i] <= 104
     * nums 已按升序排列
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }

        }
        return left + 1;

    }



}
