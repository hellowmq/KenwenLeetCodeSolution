package com.wenmq.cn.leetcode;

/**
 * Q1518
 * https://leetcode-cn.com/problems/water-bottles/
 */
public class Solution1518 {
    /**
     * 1 <= numBottles <= 100
     * 2 <= numExchange <= 100
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while (sum >= numExchange) {
            numBottles = numBottles + sum / numExchange;
            sum = sum / numExchange + sum % numExchange;
        }
        return numBottles;
    }

}
