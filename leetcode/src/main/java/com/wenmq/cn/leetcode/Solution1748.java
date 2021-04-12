package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Q1748
 * https://leetcode-cn.com/problems/sum-of-unique-elements/
 */
public class Solution1748 {
    /**
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     */
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> j : map.entrySet()) {
            if (j.getValue() == 1) {
                sum += j.getKey();
            }
        }
        return sum;
    }

    /**
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     * 写出花里胡哨的代码并不困难
     * 取巧大致上可以快速通过，不过这个题还是应该用正经的解法
     */
    public int sumOfUnique2(int[] nums) {
        int[] set = new int[8];
        int sum = 0;
        for (int num : nums) {
            int i = set[num >> 4] >> ((num & 0xF) << 1) & 3;
            switch (i) {
                case 0:
                    set[num >> 4] |= 1 << ((num & 0xF) << 1);
                    sum += num;
                    break;
                case 1:
                    set[num >> 4] |= 2 << ((num & 0xF) << 1);
                    sum -= num;
                    break;
                default:
                    // ignore
            }
        }
        return sum;
    }

}
