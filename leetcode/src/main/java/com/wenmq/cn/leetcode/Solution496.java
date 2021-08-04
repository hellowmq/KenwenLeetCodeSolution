package com.wenmq.cn.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Q496
 * https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class Solution496 {
    /**
     * 1 <= nums1.length <= nums2.length <= 1000
     * 0 <= nums1[i], nums2[i] <= 10^4
     * nums1 和 nums2 中所有整数 互不相同
     * nums1 中的所有整数同样出现在 nums2 中
     * 单调栈，O(M + N) 时间空间复杂度
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        short[] count = new short[10000];
        int n1 = nums1.length;
        Deque<Integer> stack = new ArrayDeque<>(n1);

        for (int j : nums2) {
            while (!stack.isEmpty() && stack.peek() < j) {
                count[stack.pop()] = (short) (j + 1);
            }
            stack.push(j);
        }

        for (int i = 0; i < n1; i++) {
            nums1[i] = --count[nums1[i]];
        }
        return nums1;
    }


}
