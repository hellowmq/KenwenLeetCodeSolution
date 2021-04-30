package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1431
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class Solution1431 {
    /**
     * 先找出最大值
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int candie : candies) {
            max = Math.max(candie, max);
        }
        max -= extraCandies;
        for (int candie : candies) {
            list.add(candie >= max);
        }
        return list;

    }

}
