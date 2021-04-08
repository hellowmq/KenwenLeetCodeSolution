package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Q454
 * https://leetcode-cn.com/problems/4sum-ii/
 */
public class Solution454 {
    /**
     * 方法一：利用 HashMap 的 merge 方法优化时间开销
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int lenA = A.length;
        int res = 0;
        int lenB = B.length;
        Map<Integer, Integer> map = new HashMap<>(lenA * lenB);

        for (int a : A) {
            for (int b : B) {
                map.merge(a + b, 1, Integer::sum);
            }
        }
        for (int c : C) {
            for (int d : D) {
                res += map.getOrDefault(-c - d, 0);
            }
        }

        return res;
    }

    /**
     * 方法二
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public int fourSumCount2(int[] A, int[] B, int[] C, int[] D) {
        return new Solution().fourSumCount(A, B, C, D);
    }

    public static class Solution {

        private static class Node {
            int value;
            int count;
            Node next;

            public Node(int value) {
                this.value = value;
                this.count = 1;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.count = 1;
                this.next = next;
            }
        }

        private static class Map {

            Node[] table;

            public Map(int initalCapacity) {
                if (initalCapacity < 16) {
                    initalCapacity = 16;
                } else {
                    initalCapacity = Integer.highestOneBit(initalCapacity - 1) << 1;
                }
                table = new Node[initalCapacity];
            }

            // 拷贝的HashMap的hash方法
            private int hash(int value) {
                if (value < 0) {
                    value = -value;
                }
                int h;
                return (value == 0) ? 0 : (h = value) ^ (h >>> 16);
            }

            public void put(int value) {
                int tableIndex = hash(value) & table.length - 1;
                Node head = table[tableIndex];
                if (head == null) {
                    table[tableIndex] = new Node(value);
                    return;
                }
                Node cur = head;
                while (cur != null) {
                    if (cur.value == value) {
                        cur.count++;
                        return;
                    }
                    cur = cur.next;
                }

                // 头插法
                table[tableIndex] = new Node(value, head);
            }

            public int getCount(int value) {
                int tableIndex = hash(value) & table.length - 1;
                Node head = table[tableIndex];
                if (head == null) {
                    return 0;
                }
                Node cur = head;
                while (cur != null) {
                    if (cur.value == value) {
                        return cur.count;
                    }
                    cur = cur.next;
                }
                return 0;
            }
        }


        /**
         * fourSumCount
         */
        @SuppressWarnings("checkstyle:ParameterName")
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

            // 避免扩容, 初始化一个最大初始容量
            Map abMap = new Map(A.length * B.length);

            for (int a : A) {
                for (int b : B) {
                    abMap.put(a + b);
                }
            }

            int res = 0;
            for (int c : C) {
                for (int d : D) {
                    res += abMap.getCount(-c - d);
                }
            }
            return res;
        }
    }
}
