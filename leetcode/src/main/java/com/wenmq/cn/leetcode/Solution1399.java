package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q1399
 * https://leetcode-cn.com/problems/count-largest-group/
 */
public class Solution1399 {
    /**
     * 1 <= n <= 10^4
     */
    public int countLargestGroup(int n) {
        if (n < 10) {
            return n;
        }
        if (n == 10000) {
            return 1;
        }
        // 最大位数和为36(9+9+9+9)
        int[] set = new int[37];
        // 千位
        int high = 0;
        thousandCount(set, high, n / 1000);
        // 百位
        high += n / 1000;
        n = n % 1000;
        hundredCount(set, high, n / 100);
        // 十位
        high += n / 100;
        n = n % 100;
        tenCount(set, high, n / 10);
        // 个位
        high += n / 10;
        n = n % 10;
        unitCount(set, high, n);

        set[0] = 0;
        return maxCount(set);
    }

    void unitCount(int[] arr, int high, int num) {
        for (int i = 0; i <= num; i++) {
            arr[high + i]++;
        }
    }

    void tenCount(int[] arr, int high, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 10; j++) {
                arr[high + i + j]++;
            }
        }
    }

    void hundredCount(int[] arr, int high, int num) {
        int[] temp = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        };
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 19; j++) {
                arr[high + i + j] += temp[j];
            }
        }
    }

    void thousandCount(int[] arr, int high, int num) {
        int[] temp = new int[]{
                1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75, 75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1
        };
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 28; j++) {
                arr[high + i + j] += temp[j];
            }
        }
    }

    int maxCount(int[] arr) {
        int max = 0;
        int maxCount = 0;
        for (int value : arr) {
            if (value > max) {
                max = value;
                maxCount = 1;
            } else if (value == max) {
                maxCount++;
            }
        }
        return maxCount;
    }

}
