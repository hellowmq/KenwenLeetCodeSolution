package com.wenmq.cn.leetcode;

/**
 * Q202
 * https://leetcode-cn.com/problems/happy-number/
 */
public class Solution202 {
    /**
     * 1 <= n <= 2^31 - 1
     */
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            if (slow == 1) {
                break;
            }
        } while (slow != fast);
        return slow == 1;
    }

    public int squareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int k = n % 10;
            sum += k * k;
            n /= 10;
        }
        return sum;
    }


}
