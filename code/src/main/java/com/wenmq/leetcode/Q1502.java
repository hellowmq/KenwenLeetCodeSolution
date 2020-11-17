package com.wenmq.leetcode;

/**
 * Q148
 * https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 * 题解：
 * https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/solution/java-kong-jian-huan-shi-jian-by-hellowmq/
 */
public class Q1502 {
    static class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int a : arr) {
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }
            }
            if (max == min) {
                return true;
            }
            int len = arr.length;
            boolean[] c = new boolean[len];
            if ((max - min) % (len - 1) != 0) {
                return false;
            }
            int d = (max - min) / (len - 1);
            for (int value : arr) {
                int i1 = value - min;
                int i2 = i1 / d;
                if ((i1 % d == 0) && (i2 < len) && (i2 > -1) && !c[i2]) {
                    c[i2] = true;
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,2,4};
        System.out.println(solution.canMakeArithmeticProgression(array));
        array = new int[]{3,5,1};
        System.out.println(solution.canMakeArithmeticProgression(array));
    }

}
