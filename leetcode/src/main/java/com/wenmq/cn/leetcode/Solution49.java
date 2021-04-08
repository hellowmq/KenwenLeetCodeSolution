package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Q49
 * https://leetcode-cn.com/problems/group-anagrams/
 */
public class Solution49 {

    /**
     * 不会写就只能 copy 别人的代码
     * 大佬写的封装工具类能有效提高性能。
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new LinkedList<>();
        if (strs == null || strs.length == 0) {
            return lists;
        }

        // 以Node为key，自定义实现Node的equals方法，如果是异位词，则equals相等
        HashMap<Node, LinkedList<String>> map = new HashMap<>();

        for (String str : strs) {
            Node node = new Node(str);
            LinkedList<String> list = map.getOrDefault(node, new LinkedList<>());
            list.add(str);
            map.put(node, list);
        }

        lists.addAll(map.values());
        return lists;
    }

    // 封装Node，自定义hashcode和equals方法，通过字母次数进行比较
    private static class Node {
        String s;
        int[] count = new int[26];

        public Node(String s) {
            this.s = s;
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Node)) {
                return false;
            }
            Node other = (Node) obj;
            if (this.s.length() != other.s.length()) {
                return false;
            }
            for (int i = 0; i < 26; i++) {
                if (this.count[i] != other.count[i]) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 0;
            for (int i = 0; i < 26; i++) {
                hash = hash * 31 + this.count[i];
            }
            return hash;
        }
    }


    /**
     * 性能并不是很好
     * 放弃这种想法，但是思路可以帮助理解
     */
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Stream.of(strs).parallel().collect(Collectors.groupingBy(x -> {
            char[] cs = x.toCharArray();
            Arrays.sort(cs);
            return new String(cs);
        })).forEach((k, v) -> ans.add(v));
        return ans;
    }


}
