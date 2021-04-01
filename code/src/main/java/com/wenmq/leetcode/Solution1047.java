package com.wenmq.leetcode;

import java.util.LinkedList;

/**
 * Q1047
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class Solution1047 {

    /**
     * 使用和栈顶元素的碰撞来模拟成对存在的字符
     * @param S 目标字符串
     * @return 结果
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public String removeDuplicates(String S) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < S.length(); i++) {
            int c = S.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer a : stack) {
            sb.append((char) (int) a);
        }
        return sb.reverse().toString();
    }

    /**
     * 基于方法一的优化
     * 用 {@link String#toCharArray()} 得到的数组作为栈空间
     * 用一个 index 作为栈顶标记即可
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public String removeDuplicates2(String S) {
        int index = -1;
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (index >= 0 && chars[index] == chars[i]) {
                index--;
            } else {
                index++;
                chars[index] = chars[i];
            }
        }
        return String.copyValueOf(chars, 0, index + 1);
    }

}
