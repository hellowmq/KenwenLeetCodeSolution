package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q435
 * https://leetcode-cn.com/problems/non-overlapping-intervals/
 */
public class Solution435 {
    /**
     * 先排序左边界
     * 容纳一个不重叠区间
     * 放弃右边界更大的 [1,4],[2,3] 抛弃 [1,4]
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        if (intervals.length == 0) {
            return 0;
        }
        int count = 0;
        int pre = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[pre][1] > intervals[i][0]) {
                // 有重叠
                count++;
                if (intervals[pre][1] > intervals[i][1]) {
                    // 用子集区间替换原有区间
                    pre = i;
                }
            } else {
                // 无重叠
                pre = i;
            }
        }
        return count;
    }


    /**
     * 更高效的做法，说实话没怎么看懂
     */
    public int eraseOverlapIntervals2(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int ret = 0;
        int nowRight = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            int j = i + 1;
            while (j < intervals.length) {
                if (intervals[j - 1][0] < intervals[j][0]) {
                    break;
                }
                j++;
                ret++;
            }
            if (j >= intervals.length) {
                break;
            }
            int nextRight = intervals[j][1];
            if (intervals[j][0] < nowRight) {

                if (nextRight <= nowRight) {
                    nowRight = nextRight;
                }
                ret++;

            } else {
                nowRight = nextRight;
            }
            i = j - 1;

        }
        return ret;
    }

}
