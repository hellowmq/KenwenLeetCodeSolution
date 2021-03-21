package com.wenmq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Q349
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
class Solution349 {

    /**
     * 用一个桶来优化 HashSet 的校验
     * 但是吧，这种做法实际上是针对 测试用例优化。
     * 一旦 max - min 数值过大
     * 就会申请过多无效的内存空间
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        boolean[] arr = new boolean[max - min + 1];
        for (int num : nums1) {
            arr[num - min] = true;
        }
        int[] tmp = new int[max - min + 1];
        int idx = 0;
        for (int num : nums2) {
            if (num >= min && num <= max && arr[num - min]) {
                tmp[idx++] = num;
                arr[num - min] = false;//保证每个值只存储一次
            }
        }

        // 修剪数组，返回结果
        int[] ret = new int[idx];
        if (idx >= 0) System.arraycopy(tmp, 0, ret, 0, idx);
        return ret;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        return new Solution().intersection(nums1, nums2);
    }


    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                set2.add(num);
            }
            return getIntersection(set1, set2);
        }

        public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
            if (set1.size() > set2.size()) {
                return getIntersection(set2, set1);
            }
            Set<Integer> intersectionSet = new HashSet<>();
            for (int num : set1) {
                if (set2.contains(num)) {
                    intersectionSet.add(num);
                }
            }
            int[] intersection = new int[intersectionSet.size()];
            int index = 0;
            for (int num : intersectionSet) {
                intersection[index++] = num;
            }
            return intersection;
        }
    }
}