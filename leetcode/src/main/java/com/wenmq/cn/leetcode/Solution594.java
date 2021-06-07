package com.wenmq.cn.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Q594
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 */
public class Solution594 {
    /**
     * 1 <= nums.length <= 2 * 10^4
     * -10^9 <= nums[i] <= 10^9
     */
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            if (map.containsKey(key + 1)) {
                max = Math.max(max, value + map.get(key + 1));
            }
        }
        return max;
    }

    /**
     * 先排序
     */
    public int findLHS2(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1]) {
            return 0;
        }

        int ret = 0;
        int preC = -1;
        int curC = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                ++curC;
                if (preC != -1) {
                    ret = Math.max(ret, preC + curC);
                }
            } else if (nums[i] == nums[i - 1] + 1) {
                ret = Math.max(ret, preC + curC);
                preC = curC;
                curC = 1;
                ret = Math.max(ret, preC + curC);
            } else {
                preC = -1;
                curC = 1;
            }
        }
        return ret;
    }

}
