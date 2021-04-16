package com.wenmq.cn.leetcode;

/**
 * Q1614
 * https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class Solution1614 {
    /**
     * 这个题也不需要用到栈，标记当前嵌套层数就好了
     * 为什么用 switch-case
     * 假想其他括号的拓展，用 switch-case 能避免逻辑判断
     */
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    count++;
                    max = Math.max(max, count);
                    break;
                case ')':
                    count--;
                    break;
                default:
                    // ignore
            }
        }
        return max;
    }

}
