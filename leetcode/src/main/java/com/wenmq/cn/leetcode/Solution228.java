package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q228
 * https://leetcode-cn.com/problems/summary-ranges/
 */
public class Solution228 {
    /**
     * 0 <= nums.length <= 20
     * -2^31 <= nums[i] <= 2^31 - 1
     * nums 中的所有值都互不相同
     * nums 按升序排列
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                list.add(String.valueOf(nums[i]));
                break;
            }
            if (nums[i] < nums[i + 1] - 1) {
                list.add(String.valueOf(nums[i]));
            } else {
                int pre = nums[i];
                StringBuilder sb = new StringBuilder().append(pre).append("->");
                while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                    i++;
                }
                sb.append(nums[i]);
                list.add(sb.toString());
            }
        }
        return list;
    }

}
