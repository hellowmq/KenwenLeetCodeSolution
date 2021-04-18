package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q1640
 * https://leetcode-cn.com/problems/check-array-formation-through-concatenation/
 */
public class Solution1640 {
    /**
     * 用数组存储
     */
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = pieces.length;
        int index = 0;
        int[] map = new int[101];
        Arrays.fill(map, -1);
        //存储子数组开头元素的索引
        for (int i = 0; i < n; i++) {
            map[pieces[i][0]] = i;
        }
        //找到开头元素所在子数组的索引，然后逐个比较
        while (index < arr.length) {
            if (map[arr[index]] != -1) {
                int[] piece = pieces[map[arr[index]]];
                for (int value : piece) {
                    if (value != arr[index]) {
                        return false;
                    }
                    index++;
                }
            } else {
                return false;
            }
        }
        return true;

    }
}
