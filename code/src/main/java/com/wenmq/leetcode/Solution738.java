package com.wenmq.leetcode;

/**
 * Q738
 * https://leetcode-cn.com/problems/monotone-increasing-digits/
 */
public class Solution738 {
    /**
     * 方法一：
     * 我原本认为这种写法并不美观
     * 但是他的耗时真的很短。
     */
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        int length = s.length();
        char[] chars = s.toCharArray();
        int flag = length;
        for (int i = length - 1; i >= 1; i--) {
            if (chars[i] < chars[i - 1]) {
                flag = i;
                chars[i - 1]--;
            }
        }

        for (int i = flag; i < length; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(new String(chars));
    }


    /**
     * 同样不是我写的，但是基本能理解思路
     * 从右向左 ⬅️ 遍历
     * 利用 next 作为高位数的允许的最大值
     * bias 作为位数偏移量
     * sum 求和或者用于重置 next = 0 情况的
     */
    public int monotoneIncreasingDigits2(int N) {
        int sum = 0;
        int bias = 1;
        int next = 10;
        while (N > 0) {
            int numInTen = N % 10;
            if (numInTen <= next) {
                // 高位的数比低位小，正常累加，更新高位最大值 next
                sum += numInTen * bias;
                next = numInTen;
            } else {
                // 高位的数比低位大，编程 高位 * 10^k -1
                //  322 会重置为 299；这里是 sum =
                sum = numInTen * bias - 1;
                next = numInTen - 1;
            }
            N /= 10;
            bias *= 10;
        }
        return sum;
    }

}
