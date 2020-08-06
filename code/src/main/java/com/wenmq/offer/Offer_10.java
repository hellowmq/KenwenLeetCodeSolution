package com.wenmq.offer;

/**
 * Offer-10-1
 * 斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。
 * 答案需要取模 1e9+7（1000000007）
 */

/**
 * Offer-10-2
 * 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 */
public class Offer_10 {


    /**
     * DP 的想法
     * 使用 O(N) 空间
     */
    class Solution1 {
        public int fib(int n) {
            if (n < 2) return n;
            int[] fibo = new int[n + 1];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < n + 1; i++) {
                fibo[i] = ((fibo[i - 1] + fibo[i - 2]) % (1000000007));
            }
            return fibo[n];
        }
    }

    /**
     * 迭代的想法
     * 只保留前两项的值
     * 使用 O(1) 空间
     */
    class Solution2 implements Solution{
        @Override
        public int fib(int n) {

            final int constant = 1000000007;
            int first = 0;
            int second = 1;
            while (n-- > 0) {
                int temp = first + second;
                first = second;
                second = temp % constant;
            }
            return first;

        }
    }


    interface Solution {
        public int fib(int n);
    }
}
