package com.wenmq.leetcode;

import java.util.Arrays;

/**
 * Q164
 * https://leetcode-cn.com/problems/maximum-gap/
 */
public class Solution164 {
    /**
     * 大神的解法，反正我是写不出来！！
     * 桶排序
     */
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        int len = nums.length;

        // 找出最大值和最小值 为了方便后面确定桶的数量
        int max = -1, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        // 排除nums全部为一样的数字，nums = [1,1,1,1,1,1];
        if (max - min == 0) return 0;
        // 用于存放每个桶的最大值
        int[] bucketMin = new int[len - 1];
        // 用于存放每个桶的最小值
        int[] bucketMax = new int[len - 1];
        Arrays.fill(bucketMax, -1);
        Arrays.fill(bucketMin, Integer.MAX_VALUE);

        // 确定桶的间距
        int interval = (int) Math.ceil((double) (max - min) / (len - 1));
        for (int i = 0; i < len; i++) {
            // 找到每一个值所对应桶的索引
            int index = (nums[i] - min) / interval;
            if (nums[i] == min || nums[i] == max) continue;
            // 更新每个桶的数据
            bucketMax[index] = Math.max(bucketMax[index], nums[i]);
            bucketMin[index] = Math.min(bucketMin[index], nums[i]);
        }

        // maxGap 表示桶之间最大的差距
        int maxGap = 0;
        // preMax 表示前一个桶的最大值
        int preMax = min;
        for (int i = 0; i < len - 1; i++) {
            // 表示某一个桶为空
            // 但凡某一个桶不为空，都会在前面的数据中更新掉bucketMax的值
            if (bucketMax[i] == -1) continue;
            maxGap = Math.max(bucketMin[i] - preMax, maxGap);
            preMax = bucketMax[i];
        }
        // [1,10000000]
        maxGap = Math.max(maxGap, max - preMax);
        return maxGap;
    }

    /**
     * 实际上，这个解法不符合题目要求，尽管看上去耗时更短，但不符合线性复杂度的要求
     * 众所周知 一般情况下 O(31N) > O(N*logN)
     * 年轻人👱不讲武德
     */
    public int maximumGap2(int[] nums) {
        // 排序
        Arrays.sort(nums);
        int ans = 0;
        // 遍历找到最大值
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, nums[i] - nums[i - 1]);
        }
        return ans;
    }


}
