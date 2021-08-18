package com.wenmq.offer;

/**
 * Offer-14-2
 * 剪绳子2
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1] 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class Offer_14_2 {

    public static void main(String[] args) {
        Solution solution = new Solution1();
        for (int i = 2; i < 16; i++) {
            System.out.println(i * 10 + "    " + solution.cuttingRope(i * 10));
        }

    }

    static class Solution1 implements Solution {

        @Override
        public int cuttingRope(int n) {
            if (n == 2) return 1;
            if (n == 3) return 2;
            int length = n;
            long product = 1;
            if (n % 3 == 1) {
                length -= 4;
                product *= 4;
            } else if (n % 3 == 2) {
                length -= 2;
                product *= 2;
            }
            while (length > 0) {
                product *= 3;
                product = product % 1000000007;
                length -= 3;
            }
            return (int) product;
        }
    }

    interface Solution {
        public int cuttingRope(int n);
    }

}
