package com.wenmq.cn.leetcode;

/**
 * Q150
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
public class Solution150 {

    /**
     * evalRPN
     */
    public int evalRPN(String[] tokens) {
        int length = tokens.length;
        int[] arr = new int[length];
        int top = -1;
        for (String str : tokens) {
            switch (str) {
                case "+":
                    arr[--top] += arr[top + 1];
                    break;
                case "-":
                    arr[--top] -= arr[top + 1];
                    break;
                case "*":
                    arr[--top] *= arr[top + 1];
                    break;
                case "/":
                    arr[--top] /= arr[top + 1];
                    break;
                default:
                    arr[++top] = Integer.parseInt(str);
                    break;
            }
        }
        return arr[top];
    }
}