package com.wenmq.cn.leetcode;

/**
 * Q1310
 * https://leetcode-cn.com/problems/xor-queries-of-a-subarray/
 */
public class Solution1310 {
    /**
     * 1 <= arr.length <= 3 * 10^4
     * 1 <= arr[i] <= 10^9
     * 1 <= queries.length <= 3 * 10^4
     * queries[i].length == 2
     * 0 <= queries[i][0] <= queries[i][1] < arr.length
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] arrXOR = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrXOR[i + 1] = arrXOR[i] ^ arr[i];
        }
        int[] nums = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
           nums[i] = arrXOR[queries[i][0]] ^  arrXOR[queries[i][1] + 1];
        }
        return nums;
    }

}
