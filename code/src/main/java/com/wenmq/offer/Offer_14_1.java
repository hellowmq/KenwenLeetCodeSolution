package com.wenmq.offer;

/**
 * Offer-14-1
 * 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1）
 * ，每段绳子的长度记为 k[0],k[1]...k[m-1] 。
 * 请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class Offer_14_1 {

    public static void main(String[] args) {
        Solution solution = new Solution1();
        for (int i = 2; i < 16; i++) {
            System.out.println(i + "    " + solution.cuttingRope(i));
        }

    }

    static class Solution1 implements Solution {

        @Override
        public int cuttingRope(int n) {
            if (n == 2) return 1;
            if (n == 3) return 2;
            int v3 = n / 3;
            int v4 = 1;
            if (n % 3 == 1) {
                v4 = 4;
                v3--;
            } else if (n % 3 == 2) {
                v4 = 2;
            }
            int pow = (int) Math.pow(3, v3);
            return pow * v4;
        }
    }


    static class Solution2 implements Solution {

        @Override
        public int cuttingRope(int n) {
            if (n == 2) return 1;
            if (n == 3) return 2;
            int v3 = n / 3;
            if (n % 3 == 1) {
                return (int) Math.pow(3, v3 - 1) * 4;
            } else if (n % 3 == 2) {
                return (int) Math.pow(3, v3) * 2;
            }else {
                return (int) Math.pow(3,v3);
            }
        }
    }

    interface Solution {
        public int cuttingRope(int n);
    }

}
