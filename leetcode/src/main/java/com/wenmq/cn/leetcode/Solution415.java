package com.wenmq.cn.leetcode;

import java.util.Stack;

/**
 * Q415
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution415 {
    /**
     * num1 和 num2 的长度都小于 5100
     * num1 和 num2 都只包含数字 0-9
     * num1 和 num2 都不包含任何前导零
     * 你不能使用任何內建 BigInteger 库，也不能直接将输入的字符串转换为整数形式
     */
    public String addStrings(String num1, String num2) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(num1.length());
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            carry += i >= 0 ? num1.charAt(i--) - '0' : 0;
            carry += j >= 0 ? num2.charAt(j--) - '0' : 0;
            stack.push(carry % 10);
            carry = carry / 10;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    /**
     * 其他人的做法
     */
    public String addStrings2(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        if (l1 < l2) {
            return addStrings(num2, num1);
        }
        int t = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = l1 - 1, j = l2 - 1; i >= 0; i--) {
            t += num1.charAt(i) - '0';
            if (j >= 0) {
                t += num2.charAt(j--) - '0';
            }
            sb.append(t % 10);
            t /= 10;
        }
        if (t > 0) {
            sb.append(t);
        }
        return sb.reverse().toString();
    }
}
