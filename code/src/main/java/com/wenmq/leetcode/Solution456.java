package com.wenmq.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Q456
 * https://leetcode-cn.com/problems/132-pattern/
 */
public class Solution456 {
    /**
     * 反序遍历的单调栈
     */
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int last = Integer.MIN_VALUE;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < last) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                last = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }


    public boolean find132pattern2(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int last = Integer.MIN_VALUE;
        int index = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < last) {
                return true;
            }
            while (index < nums.length && nums[index] < nums[i]) {
                last = nums[index++];
            }
            if (index > 0) {
                nums[--index] = nums[i];
            }
        }
        return false;
    }

}
