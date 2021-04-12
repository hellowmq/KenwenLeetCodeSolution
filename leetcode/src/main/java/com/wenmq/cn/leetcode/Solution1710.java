package com.wenmq.cn.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Q1710
 * https://leetcode-cn.com/problems/maximum-units-on-a-truck/
 */
public class Solution1710 {
    /**
     * 方法一：
     */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //重写比较器,让能装单元数多的箱子排在前边
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        //贪心,先让能装多的箱子上车
        int count = 0;
        for (int[] box : boxTypes) {
            if (box[0] < truckSize) {
                //0表示箱子数量,1表示箱子里装的单元数
                count += box[0] * box[1];
                truckSize -= box[0];
            } else {
                count += truckSize * box[1];
                return count;
            }
        }
        return count;
    }

}
