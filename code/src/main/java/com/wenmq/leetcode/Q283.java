package com.wenmq.leetcode;

import com.wenmq.tools.ArrayTools;

/**
 * Q148
 * https://leetcode-cn.com/problems/find-the-difference/
 */
public class Q283 {
    static class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) return;
            int indexOfNotZero = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[indexOfNotZero] = nums[i];
                    indexOfNotZero++;
                }
            }
            for (int i = indexOfNotZero; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {0, 1, 0, 3, 12};
        ArrayTools.printArray(array);
        solution.moveZeroes(array);
        ArrayTools.printArray(array);
        System.out.println("---------------------------");

        int[] error_case_0 = {0};
        int[] error_case_1 = {1, 0};
        solution.moveZeroes(error_case_0);
        ArrayTools.printArray(error_case_0);
        solution.moveZeroes(error_case_1);
        ArrayTools.printArray(error_case_1);


    }

}
