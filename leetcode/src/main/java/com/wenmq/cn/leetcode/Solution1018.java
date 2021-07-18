package com.wenmq.cn.leetcode;

import java.util.List;

/**
 * Q1018
 * https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 */
public class Solution1018 {
    /**
     * 1 <= A.length <= 30000
     * A[i] 为 0 或 1
     */
    public List<Boolean> prefixesDivBy5(int[] nums) {
        boolean[] result = new boolean[nums.length];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            a <<= 1;
            a |= num;
            if ((a %= 5) == 0) {
                result[i] = true;
            }
        }
        return new AList(result);
    }

    static class AList extends java.util.AbstractList<Boolean> {
        final boolean[] array;

        public AList(boolean[] array) {
            this.array = array;
        }

        @Override
        public Boolean get(int index) {
            return array[index];
        }

        @Override
        public int size() {
            return array.length;
        }
    }


    public List<Boolean> prefixesDivBy5_2(int[] nums) {
        boolean[] result = new boolean[nums.length];
        byte[][] transform = new byte[][]{
                {0, 1}, {2, 3}, {4, 0}, {1, 2}, {3, 4}
        };
        byte status = 0;
        for (int i = 0; i < nums.length; i++) {
            status = transform[status][nums[i]];
            result[i] = status == 0;
        }
        return new AList(result);
    }
}
