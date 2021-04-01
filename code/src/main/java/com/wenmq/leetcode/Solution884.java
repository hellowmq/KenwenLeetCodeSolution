package com.wenmq.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Q884
 * https://leetcode-cn.com/problems/maximum-gap/
 */
public class Solution884 {
    /**
     * 统计计数法，共享一个 map
     * 如果计算 A + " " + B 会导致额外的内存空间消耗
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        String[] sA = A.split(" ");
        String[] sB = B.split(" ");
        for (String a : sA) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (String a : sB) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }

}
