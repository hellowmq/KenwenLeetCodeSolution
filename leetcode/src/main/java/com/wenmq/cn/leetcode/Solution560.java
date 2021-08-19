package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/subarray-sum-equals-k/">
 * Q560
 * </a>
 */
public class Solution560 {
    /**
     * 数组的长度为 [1, 20000]。
     * 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
     */
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(0, 1);
        int sum = 0;
        int ret = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ret += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ret;
    }

    /**
     * 简化 for 循环操作
     */
    public int subarraySum2(int[] nums, int k) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(0, 1);
        int ret = 0;
        for (int i = 1; i < prefix.length; i++) {
            if (map.containsKey(prefix[i] - k)) {
                ret += map.get(prefix[i] - k);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        return ret;
    }

    /**
     * 按照约束条件双循环实际上非常耗时
     */
    public int subarraySum3(int[] nums, int k) {
        int size = nums.length;
        int res = 0;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += nums[j];
                if (sum == k) {
                    res++;
                }
            }
        }
        return res;
    }

}
