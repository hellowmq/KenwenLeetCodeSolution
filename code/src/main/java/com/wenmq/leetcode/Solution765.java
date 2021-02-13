package com.wenmq.leetcode;

/**
 * Q765
 * https://leetcode-cn.com/problems/couples-holding-hands/
 */
public class Solution765 {
    /**
     * 方法一：保留奇数位，用偶数位与匹配交换
     */
    public int minSwapsCouples(int[] row) {
        int result = 0;
        for (int i = 1; i < row.length; i = i + 2) {
            if ((row[i] ^ row[i - 1]) == 1) {
                continue;
            }
            int index = i + 1;
            while ((index < row.length) && ((row[i] ^ row[index]) != 1)) {
                index++;
            }
            int temp = row[index];
            row[index] = row[i - 1];
            row[i - 1] = temp;
            result++;
        }
        return result;
    }

}
