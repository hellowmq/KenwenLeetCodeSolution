package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Q1436
 * https://leetcode-cn.com/problems/destination-city/
 */
public class Solution1436 {
    /**
     * 用一个 HashMap 在不是一条链的情况下，可以减小空间开销
     */
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : paths) {
            map.put(pair.get(0), getNext(map, pair.get(1)));
        }
        String next = map.keySet().iterator().next();
        while (map.containsKey(next)) {
            next = map.get(next);
        }
        return next;
    }

    private static String getNext(Map<String, String> map, String key) {
        if (!map.containsKey(key)) {
            return key;
        }
        String result = map.get(key);
        map.remove(key);
        return result;
    }

    /**
     * 直接使用集合，空间开销固定，只需固定填充和遍历
     */
    public String destCity2(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> list : paths) {
            set.add(list.get(0));
        }
        for (List<String> list : paths) {
            if (set.contains(list.get(1))) {
                continue;
            }
            return list.get(1);
        }
        return null;
    }

}
