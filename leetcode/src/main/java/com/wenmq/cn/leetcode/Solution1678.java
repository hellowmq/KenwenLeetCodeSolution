package com.wenmq.cn.leetcode;

/**
 * Q1678
 * https://leetcode-cn.com/problems/goal-parser-interpretation/
 */
public class Solution1678 {
    /**
     * 1 <= command.length <= 100
     * command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成
     */
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;
                }
            } else if (c != ')') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 用数组
     */
    public String interpret2(String command) {
        char[] chars = new char[command.length()];
        int index = 0;
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == '(') {
                if (command.charAt(i + 1) == ')') {
                    chars[index++] = 'o';
                    i++;
                }
            } else if (c != ')') {
                chars[index++] = c;
            }
        }
        return String.copyValueOf(chars, 0, index);
    }

}
