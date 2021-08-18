package com.wenmq.offer;

/**
 * Offer-15
 * 二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 */
public class Offer_15 {


    class Solution1 implements Solution {

        @Override
        public int hammingWeight(int n) {
            int hammingWeightCount = 0;
            while (n != 0) {
                n &= (n - 1);
                hammingWeightCount++;
            }
            return hammingWeightCount;
        }
    }


    public interface Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n);
    }
}
