package com.wenmq.cn.leetcode;

/**
 * Q1716
 * https://leetcode-cn.com/problems/calculate-money-in-leetcode-bank/
 */
public class Solution1716 {
    /**
     * 1,2,3,4,5,6,7
     * 2,3,4,5,6,7,8
     * 3,4,5,6,7,8,9
     * ...
     * 规律比较明显
     * 这是等差数列
     * 首先排除 O(n) 的写法
     * 这里的 b < 7 ，因此仍然是 O(n) 复杂度
     */
    public int totalMoney(int n) {
        int first = 28;
        int a = n / 7;
        int sum = a * first + a * (a - 1) * 7 / 2;
        int b = n % 7;
        first = a + 1;
        while (b > 0) {
            sum += first;
            first++;
            b--;
        }
        return sum;
    }

    /**
     * 从上述解法中，可以整理出通项公式
     */
    public int totalMoney2(int n) {
        int first = 28;
        int a = n / 7;
        int b = n % 7;
        return first * a + 7 * a * (a - 1) / 2
                + (a + 1) * b + b * (b - 1) / 2;
//        return ((7 * a + 2 * b + 49) * a + b * (b + 1)) >> 1;
//        减少重复运算的极致，这样写有点过分
    }

}
