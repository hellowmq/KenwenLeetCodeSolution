package com.wenmq.cn.leetcode;

/**
 * Q1534
 * https://leetcode-cn.com/problems/count-good-triplets/
 */
public class Solution1534 {
    /**
     * 3 <= arr.length <= 100
     * 0 <= arr[i] <= 1000
     * 0 <= a, b, c <= 1000
     */
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int len = arr.length;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) {
                    continue;
                }
                for (int k = j + 1; k < len; k++) {
                    if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }


    /**
     * 3 <= arr.length <= 100
     * 0 <= arr[i] <= 1000
     * 0 <= a, b, c <= 1000
     */
    public int countGoodTriplets2(int[] arr, int a, int b, int c) {
        int ans = 0;
        int n = arr.length;
        int[] sum = new int[1001];
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (Math.abs(arr[j] - arr[k]) <= b) {
                    int lj = arr[j] - a;
                    int rj = arr[j] + a;
                    int lk = arr[k] - c;
                    int rk = arr[k] + c;
                    int l = Math.max(0, Math.max(lj, lk));
                    int r = Math.min(1000, Math.min(rj, rk));
                    if (l <= r) {
                        if (l == 0) {
                            ans += sum[r];
                        } else {
                            ans += sum[r] - sum[l - 1];
                        }
                    }
                }
            }
            for (int k = arr[j]; k <= 1000; k++) {
                sum[k]++;
            }
        }
        return ans;
    }
}
