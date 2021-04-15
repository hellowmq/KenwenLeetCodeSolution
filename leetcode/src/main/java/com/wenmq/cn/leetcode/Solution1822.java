package com.wenmq.cn.leetcode;

/**
 * Q1822
 * https://leetcode-cn.com/problems/sign-of-the-product-of-an-array/
 */
public class Solution1822 {

    /**
     * 标记正负即可
     */
    public int arraySign(int[] nums) {
        boolean flag = true;
        for (int num : nums) {

            if (num < 0) {
                flag = !flag;
            }
            if (num == 0) {
                return 0;
            }
        }
        return flag ? 1 : -1;
    }

}
