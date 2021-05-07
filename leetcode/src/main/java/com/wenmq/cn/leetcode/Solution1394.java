package com.wenmq.cn.leetcode;

/**
 * Q1394
 * https://leetcode-cn.com/problems/find-lucky-integer-in-an-array/
 */
public class Solution1394 {
    /**
     * 开辟数组
     * 遍历统计
     * 逆序遍历
     */
    public int findLucky(int[] arr) {
        int[] nums = new int[arr.length + 1];
        for (int num : arr) {
            if (num < nums.length) {
                nums[num]++;
            }
        }
        int i = arr.length;
        while (i > 0) {
            if (nums[i] == i) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /**
     * 时间换空间
     * 一开始遍历一次，计算最大数组长度
     * 动态控制数组长度节省空间，对于部分用例更友好
     */
    public int findLucky2(int[] arr) {
        int i = 0;
        for (int num : arr) {
            if (num <= arr.length) {
                i = Math.max(i, num);
            }
        }
        int[] nums = new int[i + 1];
        for (int num : arr) {
            if (num < nums.length) {
                nums[num]++;
            }
        }
        while (i > 0) {
            if (nums[i] == i) {
                return i;
            }
            i--;
        }
        return -1;
    }

}
