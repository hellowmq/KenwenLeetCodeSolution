package com.wenmq.leetcode;

import com.wenmq.tools.ArrayTools;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * {https://leetcode-cn.com/problems/relative-sort-array/}
 */
public class Q1122 {

    static class Solution {

        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            Map<String, Integer> map = new HashMap<>(arr2.length);
            for (int a : arr2) {
                map.put(String.valueOf(a), 0);
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int[] result = new int[arr1.length];
            for (int item : arr1) {
                String key = String.valueOf(item);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    queue.add(item);
                }
            }

            int index = 0;
            for (int value : arr2) {
                int count = map.get(String.valueOf(value));
                while (count > 0) {
                    result[index] = value;
                    count--;
                    index++;
                }
            }
            while (!queue.isEmpty()) {
                result[index] = queue.poll();
                index++;
            }
            return result;
        }

        public int[] relativeSortArray1(int[] arr1, int[] arr2) {
            Map<String, Integer> map = new HashMap<>(arr2.length);
            for (int a : arr2) {
                map.put(String.valueOf(a), 0);
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int[] result = new int[arr1.length];
            for (int item : arr1) {
                String key = String.valueOf(item);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    queue.add(item);
                }
            }

            int index = 0;
            for (int value : arr2) {
                int count = map.get(String.valueOf(value));
                while (count > 0) {
                    result[index] = value;
                    count--;
                    index++;
                }
            }
            while (!queue.isEmpty()) {
                result[index] = queue.poll();
                index++;
            }
            return result;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] b = {2, 1, 4, 3, 9, 6};
        ArrayTools.printArray(a);
        ArrayTools.printArray(b);
        int[] array = solution.relativeSortArray(a, b);
        ArrayTools.printArray(array);
    }


}
