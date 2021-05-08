package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q1385
 * https://leetcode-cn.com/problems/find-the-distance-value-between-two-arrays/
 */
public class Solution1385 {
    /**
     * 1 <= arr1.length, arr2.length <= 500
     * -10^3 <= arr1[i], arr2[j] <= 10^3
     * 0 <= d <= 100
     * 暴力破解
     * arr1.length * arr2.length
     */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for (int a : arr1) {
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    /**
     * arr2 先排序，依次查找
     * (arr2.length + arr1.length) * log(arr2.length)
     */
    public int findTheDistanceValue2(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for (int a : arr1) {
            int iBottom = binary(arr2, a - d - 1);
            if (iBottom == -1) {
                count++;
                continue;
            }
            if (binary(arr2, a + d) == iBottom) {
                count++;
            }

        }
        return count;
    }

    int binary(int[] a, int val) {
        int m;
        int id = -1;
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            m = l + (r - l) / 2;
            //避免溢出
            if (a[m] > val) {
                id = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return id;

    }

    /**
     * 使用数组存储 arr2 的区间
     * d、arr2.length 增大时效率下降
     * d * arr2.length + arr1.length
     */
    public int findTheDistanceValue3(int[] arr1, int[] arr2, int d) {
        int ans = arr1.length;
        boolean[] set = new boolean[2001];
        for (int num : arr2) {
            int end = Math.min(2001, num + d + 1001);
            for (int i = Math.max(0, num - d + 1000); i < end; i++) {
                set[i] = true;
            }
        }
        for (int num : arr1) {
            if (set[num + 1000]) {
                ans--;
            }
        }
        return ans;
    }

    /**
     * 使用数组存储 arr2 的值
     * d、arr1.length 增大时效率下降
     * d * arr1.length + arr2.length
     */
    public int findTheDistanceValue4(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        // [0, 2000]
        boolean[] has = new boolean[2001];

        for (int num : arr2) {
            has[1000 + num] = true;
        }
        for (int num : arr1) {
            int idx = num + 1000;
            int start = Math.max(0, idx - d);
            int end = Math.min(2000, idx + d);
            boolean flag = false;
            for (int i = start; i <= end; i++) {
                if (has[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans++;
            }
        }
        return ans;
    }


}
