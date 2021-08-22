package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/duplicate-zeros/">
 * Q1089
 * </a>
 */
public class Solution1089 {
    /**
     * 1 <= arr.length <= 10000
     * 0 <= arr[i] <= 9
     */
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }
        int ptr = arr.length - 1;
        while (count != 0) {
            if (arr[ptr] == 0) {
                count--;
                if (ptr + count < arr.length) {
                    arr[ptr + count] = 0;
                }
                if (ptr + 1 + count < arr.length) {
                    arr[ptr + 1 + count] = 0;
                }
            } else if (ptr + count < arr.length) {
                arr[ptr + count] = arr[ptr];
            }
            ptr--;
        }
    }


    /**
     * 暴力破解
     */
    public void duplicateZeros2(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                continue;
            }
            if (arr.length - 1 - i >= 0) {
                System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
            }
            ++i;
        }
    }


}
