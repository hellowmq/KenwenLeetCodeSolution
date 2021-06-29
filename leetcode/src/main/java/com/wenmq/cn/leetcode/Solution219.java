package com.wenmq.cn.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Q219
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 */
public class Solution219 {
    /**
     * 使用 Map 集合
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (i - map.getOrDefault(nums[i], -k - 1) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    /**
     * 双重循环
     */
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 桶优化
     */
    public boolean containsNearbyDuplicate3(int[] nums, int k) {
        if (nums.length < 100) {
            Map<Integer, Integer> map = new HashMap<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                if (i - map.getOrDefault(nums[i], -k - 1) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
            return false;
        }
        int max = getMax(nums);
        int min = getMin(nums);
        int[] map = new int[max - min + 2];
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i] - min;
            if (map[num] != 0) {
                if (Math.abs(i - map[num]) < k) {
                    return true;
                }
            }
            map[num] = i + 1;
        }
        return false;
    }

    private static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int getMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }
}