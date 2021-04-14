package com.wenmq.cn.leetcode;

/**
 * Q1720
 * https://leetcode-cn.com/problems/decode-xored-array/
 */
public class Solution1720 {
    /**
     * 解码异或就是再异或
     */
    public int[] decode(int[] encoded, int first) {
        int[] array = new int[encoded.length + 1];
        array[0] = first;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] ^ encoded[i - 1];
        }
        return array;
    }

}
