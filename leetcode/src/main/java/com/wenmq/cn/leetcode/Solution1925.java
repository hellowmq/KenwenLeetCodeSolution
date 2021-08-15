package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/count-square-sum-triples/">
 * Q1925
 * </a>
 */
public class Solution1925 {

    static final int MAX_LENGTH = 251;
    static int[] sSquareLists = new int[MAX_LENGTH];

    static {
        for (int i = 0; i < MAX_LENGTH; i++) {
            sSquareLists[i] = i * i;
        }
    }

    /**
     * 1 <= n <= 250
     */
    public int countTriples(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                if (Arrays.binarySearch(sSquareLists, sSquareLists[b] - sSquareLists[a]) >= 0) {
                    count++;
                }
            }
        }
        return count;
    }


    /**
     * 提交库的高效解答
     */
    public int countTriples2(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += find(i);
        }
        return res;
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public int find(int x) {
        int low = 1;
        int high = x - 1;
        int cnt = 0;
        int b = x * x;
        while (low <= high) {
            int a = low * low + high * high;
            if (a == b) {
                cnt++;
                if (low != high) {
                    cnt++;
                }
                low++;
                high--;
            } else if (a > b) {
                high--;
            } else {
                low++;
            }
        }
        return cnt;
    }
}
