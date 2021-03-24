package com.wenmq.leetcode;

/**
 * Q389
 * https://leetcode-cn.com/problems/find-the-difference/
 * 题解
 * https://leetcode-cn.com/problems/find-the-difference/solution/chai-yi-yi-huo-a-a-0-by-hellowmq/
 */
public class Solution389 {
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

    /**
     * 利用加减消除法一定程度上也是可以的
     */
    public char findTheDifference2(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int a = 0;
        for (char b : ss) a -= b;
        for (char b : tt) a += b;
        return (char) a;
    }

    public char findTheDifference3(String s, String t) {
        int[] res = new int[26];
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for (char b : ss) res[b - 'a']--;
        for (char b : tt) res[b - 'a']++;
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) return (char) ('a' + i);
        }
        return 'a';

    }

}
