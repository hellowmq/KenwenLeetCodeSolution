package com.wenmq.cn.leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/next-greater-element-ii/">
 * Q488
 * </a>
 */
public class Solution488 {
    /**
     * 单调栈：
     * 12112
     * push(0)
     * ret[0] = 2;
     * push[1];
     * 正向遍历的做法
     */
    public int[] nextGreaterElements(int[] nums) {
        final int n = nums.length;
        final int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);

        }
        return ret;
    }

    /**
     * 反向遍历的做法
     */
    public int[] nextGreaterElements2(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return res;
    }

}
