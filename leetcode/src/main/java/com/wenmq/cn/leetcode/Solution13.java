package com.wenmq.cn.leetcode;

/**
 * Q13
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Solution13 {
    /**
     * 1 <= s.length <= 15
     * s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
     * 题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
     * 题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
     * IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
     * 关于罗马数字的详尽书写规则，可以参考
     * {https://b2b.partcommunity.com/community/knowledge/zh_CN/detail/10753/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97#knowledge_article}
     */
    public int romanToInt(String s) {
        int n = s.length();
        int romanInt = 0;
        for (int i = 0; i < n; i++) {
            romanInt += getRomanByChar(s.charAt(i));
            if (i != 0) {
                if (((s.charAt(i) == 'V') || (s.charAt(i) == 'X')) && (s.charAt(i - 1) == 'I')) {
                    romanInt = romanInt - 2;
                }
                if (((s.charAt(i) == 'L') || (s.charAt(i) == 'C')) && (s.charAt(i - 1) == 'X')) {
                    romanInt = romanInt - 10 * 2;
                }
                if (((s.charAt(i) == 'D') || (s.charAt(i) == 'M')) && (s.charAt(i - 1) == 'C')) {
                    romanInt = romanInt - 100 * 2;
                }
            }
        }
        return romanInt;
    }

    private static int getRomanByChar(char c) {
        int romanInt = 0;
        switch (c) {
            case 'I':
                romanInt = 1;
                break;
            case 'V':
                romanInt = 5;
                break;
            case 'X':
                romanInt = 10;
                break;
            case 'L':
                romanInt = 50;
                break;
            case 'C':
                romanInt = 100;
                break;
            case 'D':
                romanInt = 500;
                break;
            case 'M':
                romanInt = 1000;
                break;
            default:
                // ignore
        }
        return romanInt;
    }

}
