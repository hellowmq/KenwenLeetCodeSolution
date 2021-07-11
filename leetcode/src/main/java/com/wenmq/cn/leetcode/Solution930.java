package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Q930
 * https://leetcode-cn.com/problems/binary-subarrays-with-sum/
 */
@SuppressWarnings("SpellCheckingInspection")
public class Solution930 {
    /**
     * 1 <= nums.length <= 3 * 10^4
     * nums[i] 不是 0 就是 1
     * 0 <= goal <= nums.length
     */
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - goal)) {
                res += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }

    /**
     * map 改为 array
     */
    public int numSubarraysWithSum2(int[] nums, int goal) {
        short[] set = new short[nums.length + 1];
        int index = 0;
        set[0]++;
        for (int num : nums) {
            index += num;
            set[index]++;
        }
        int sum = 0;
        for (int i = 0; i < set.length - goal; i++) {
            if (goal == 0) {
                sum += set[i] * (set[i] - 1) >> 1;
            } else {
                sum += set[i] * set[i + goal];
            }
        }
        return sum;
    }

    /**
     * map 改为 array
     */
    public int numSubarraysWithSum3(int[] nums, int goal) {
        short[] set = new short[nums.length + 1];
        set[0]++;
        int sum = 0;
        int res = 0;
        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                res += set[sum - goal];
            }
            set[sum]++;
        }
        return res;
    }
}
