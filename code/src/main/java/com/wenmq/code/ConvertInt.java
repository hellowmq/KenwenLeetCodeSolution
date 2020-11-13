package com.wenmq.code;

public class ConvertInt {

    static class Solution {
        public int convertInteger(int A, int B) {
            long result = (A ^ B & 0xFFFFFFFFL);
            int sum = 0;
            while (result > 0) {
                result &= (result - 1);
                sum++;
            }
            return sum;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = -784351584;
        int b = -1488989877;
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Long.toBinaryString((a ^ b & 0xFFFFFFFFL)));
        System.out.println(solution.convertInteger(a, b));
    }
}
