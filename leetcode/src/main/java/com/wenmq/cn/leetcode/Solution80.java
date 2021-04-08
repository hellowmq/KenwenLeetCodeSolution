package com.wenmq.cn.leetcode;

/**
 * Q80
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class Solution80 {
    /**
     * 1 <= nums.length <= 3 * 104
     * -104 <= nums[i] <= 104
     * @param nums 已按升序排列
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

}
