package com.wenmq.leetcode;

/**
 * Q605
 * https://leetcode-cn.com/problems/can-place-flowers/
 */
public class Solution605 {
    /**
     * 方法一：
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length;) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                count++;
                i += 2;
            } else {
                i += 3;
            }
        }
        return count >= n;
    }


}
