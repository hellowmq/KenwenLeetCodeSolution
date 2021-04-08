package com.wenmq.cn.leetcode;

/**
 * Q414
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution414 {
    /**
     * 不重复第三大的数
     * 如果没有就返回最大
     */
    public int thirdMax(int[] nums) {
        long[] queue = new long[]{
                Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE
        };
        for (int num : nums) {
            if (num > queue[2] && num != queue[1] && num != queue[0]) {
                if (num > queue[0]) {
                    queue[2] = queue[1];
                    queue[1] = queue[0];
                    queue[0] = num;
                } else if (num > queue[1]) {
                    queue[2] = queue[1];
                    queue[1] = num;
                } else {
                    queue[2] = num;
                }
            }
        }
        return queue[2] == Long.MIN_VALUE ? (int) queue[0] : (int) queue[2];
    }

}
