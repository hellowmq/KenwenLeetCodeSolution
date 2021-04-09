package com.wenmq.cn.leetcode;

/**
 * Q1790
 * https://leetcode-cn.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */
public class Solution1790 {
    /**
     * 1 <= s1.length, s2.length <= 100
     * s1.length == s2.length
     * s1 和 s2 仅由小写英文字母组成
     */
    public boolean areAlmostEqual(String s1, String s2) {
        int[] nums = new int[3];
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            nums[index++] = i;
            if (index > 2) {
                return false;
            }
            if (index == 2
                    && (s1.charAt(nums[0]) != s2.charAt(nums[1])
                    || s1.charAt(nums[1]) != s2.charAt(nums[0]))) {
                return false;
            }
        }
        return s1.charAt(nums[0]) == s2.charAt(nums[1])
                && s1.charAt(nums[1]) == s2.charAt(nums[0]);
    }

}
