package com.wenmq.algo.stack;

import java.util.Stack;

/**
 * @author ifans.wen
 * @date 2020/7/4
 * @description
 */
public class StackSolution {

    public int longestValidParentheses(String s) {

        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.size() == 0) {
                    stack.push(i);
//                    更新中斷點
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }

        }

        return max;
    }
}
