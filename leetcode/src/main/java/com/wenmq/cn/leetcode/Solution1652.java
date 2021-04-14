package com.wenmq.cn.leetcode;

/**
 * Q1652
 * https://leetcode-cn.com/problems/defuse-the-bomb/
 */
public class Solution1652 {
    /**
     * 滑动窗口的思想，挺好的
     * 就是会引入重复计算
     * 尝试引入一个新的问题：把之前/之后 K 个改为包含当前数的 K + 1 个数
     * 利用左右指针就可以避免重复计算和代码膨胀
     */
    public int[] decrypt(int[] code, int k) {
        int length = code.length;
        int[] array = new int[length];
        int left = Math.min(0, k);
        int right = Math.max(0, k);
        for (int i = left; i <= right; i++) {
            array[0] += code[getSafeIndex(length, i)];
        }
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] - code[getSafeIndex(length, left++)] + code[getSafeIndex(length, ++right)];
        }
        for (int i = 0; i < length; i++) {
            array[i] -= code[i];
        }
        return array;
    }

    private int getSafeIndex(int length, int i) {
        return (length + i) % length;
    }

}
