package com.wenmq.leetcode;

/**
 * Q389
 * https://leetcode-cn.com/problems/find-the-difference/
 * 题解
 * https://leetcode-cn.com/problems/find-the-difference/solution/chai-yi-yi-huo-a-a-0-by-hellowmq/
 */
public class Q389 {
    static class Solution {
        /**
         * 利用异或操作的性质可以有 a ^ a = 0
         */
        public char findTheDifference(String s, String t) {
            char[] ss = s.toCharArray();
            char[] tt = t.toCharArray();
            char a = (char) 0;
            for (char b : ss) a ^= b;
            for (char b : tt) a ^= b;
            return a;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcd";
        String t = "abcde";
        System.out.println(solution.findTheDifference(s, t));

    }
}
