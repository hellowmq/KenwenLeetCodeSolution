package com.wenmq.cn.leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Q488
 * https://leetcode-cn.com/problems/next-greater-element-ii/
 */
public class Solution488 {
    /**
     * 单调栈：
     * 12112
     * push(0)
     * ret[0] = 2;
     * push[1];
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

}
