package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q1051
 * https://leetcode-cn.com/problems/height-checker/
 */
public class Solution1051 {
    /**
     * 多少人不在自身排序位置
     */
    public int heightChecker(int[] heights) {
        int[] newArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(newArray);
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (heights[i] != newArray[i]) {
                sum++;
            }
        }
        return sum;
    }

    /**
     * 基于条件
     * 1 <= heights.length <= 100
     * 1 <= heights[i] <= 100
     * 用桶排序
     */
    public int heightChecker2(int[] heights) {
        byte[] bytes = new byte[101];
        for (int num : heights) {
            bytes[num]++;
        }
        int index = 0;
        int sum = 0;
        for (int i = 0; i < bytes.length; i++) {
            while (bytes[i]-- > 0) {
                if (heights[index++] != i) {
                    sum++;
                }
            }
        }
        return sum;
    }

}
