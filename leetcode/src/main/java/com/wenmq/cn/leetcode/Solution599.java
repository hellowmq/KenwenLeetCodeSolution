package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Q559
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution599 {
    /**
     * 两个列表的长度范围都在 [1, 1000] 内。
     * 两个列表中的字符串的长度将在 [1，30] 的范围内。
     * 下标从0开始，到列表的长度减1。
     * 两个列表都没有重复的元素。
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> list = new ArrayList<>(list1.length);
        int min = list1.length + list2.length;
        for (int i = 0; i < list2.length && i <= min; i++) {
            int index = map.getOrDefault(list2[i], min + 1);
            if (index + i > min) {
                continue;
            }
            if (index + i < min) {
                list.clear();
                min = index + i;
            }
            list.add(list2[i]);
        }
        return list.toArray(new String[0]);
    }

}
