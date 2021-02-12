package com.wenmq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q448
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class Solution448 {
    /**
     * 方法一：用原数组空间的正负值作为存储空间，最后遍历
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]) - 1;
            if (nums[a] >= 0) {
                nums[a] = -nums[a];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }


    /**
     * 方法二：交换法，把每个自己的数放在应有的位置上，最后遍历
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            while (nums[num - 1] != num) {
                int temp = nums[num - 1];
                nums[num - 1] = num;
                num = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                ans.add(i + 1);
        }
        return ans;
    }


}
