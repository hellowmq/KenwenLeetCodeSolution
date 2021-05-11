package com.wenmq.cn.leetcode;

/**
 * Q1346
 * https://leetcode-cn.com/problems/check-if-n-and-its-double-exist/
 */
public class Solution1346 {
    /**
     * 空间换时间
     */
    public boolean checkIfExist(int[] arr) {
        int[] set = new int[64];
        for (int value : arr) {
            if ((value & 1) == 0) {
                int i = value / 2 + 1000;
                if ((set[i >> 5] & (1 << (i & 31))) != 0) {
                    return true;
                }
            }
            if (Math.abs(value) <= 500) {
                int i = (value << 1) + 1000;
                if ((set[i >> 5] & (1 << (i & 31))) != 0) {
                    return true;
                }
            }
            value += 1000;
            set[value >> 5] |= 1 << (value & 31);
        }
        return false;
    }

    /**
     * 双重循环
     */
    public boolean checkIfExist2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] * 2;
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }


}
