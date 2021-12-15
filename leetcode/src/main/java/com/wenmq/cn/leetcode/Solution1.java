package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/two-sum/">
 * Q1
 * </a>
 */
public class Solution1 {
    /**
     * <p>2 <= nums.length <= 10^4</p>
     * <p>-10^9 <= nums[i] <= 10^9</p>
     * <p>-10^9 <= target <= 10^9</p>
     * <p>只会存在一个有效答案</p>
     * <p>进阶：你可以想出一个时间复杂度小于 O(n^2) 的算法吗？</p>
     */
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = (map.get(nums[i]));
                result[1] = i;
                return result;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
