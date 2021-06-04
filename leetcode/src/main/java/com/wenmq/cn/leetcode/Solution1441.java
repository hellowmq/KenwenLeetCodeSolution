package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1441
 * https://leetcode-cn.com/problems/build-an-array-with-stack-operations/
 */
public class Solution1441 {
    /**
     * 1 <= target.length <= 100
     * 1 <= target[i] <= 100
     * 1 <= n <= 100
     * target 是严格递增的
     */
    public List<String> buildArray(int[] target, int n) {
        int initialCapacity = (target[target.length - 1] << 1) - target.length;
        List<String> list = new ArrayList<>(initialCapacity);
        int cur = 1;
        int index = 0;
        while (index < target.length) {
            list.add("Push");
            if (cur++ < target[index]) {
                list.add("Pop");
            } else {
                index++;
            }
        }
        return list;
    }

}
