package com.wenmq.leetcode;

/**
 * Q705
 * https://leetcode-cn.com/problems/design-hashset/
 */
public class Solution705 {
    public static class MyHashSet {

        public static final int length = 31251;
        /**
         * Initialize your data structure here.
         */
        int[] map = new int[length];


        public MyHashSet() {

        }

        public void add(int key) {
            map[key >> 5] |= 1 << (key & 31);
        }

        public void remove(int key) {
            map[key >> 5] &= ~(1 << (key & 31));
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            return (map[key >> 5] & 1 << (key & 31)) != 0;
        }
    }

    public static class MyHashSet2 {

        public static final int INT_LENGTH = 32;
        public static final int COL = 64;
        public static final int ROW = 501;
        public static final int TOTAL = ROW * COL * INT_LENGTH;

        public static final int INT_LENGTH_BIAS = 5;
        public static final int COL_BIAS = INT_LENGTH_BIAS + 6;
        public static final int COL_AND = 63;
        /**
         * Initialize your data structure here.
         */
        int[][] map = new int[ROW][];


        public MyHashSet2() {

        }

        public void add(int key) {
            getLazyArray(key >> COL_BIAS)[getColIndex(key)] |= getINTAND(key);
        }

        private int getINTAND(int key) {
            return 1 << (key & 31);
        }


        public void remove(int key) {
            getLazyArray(key >> COL_BIAS)[getColIndex(key)] &= ~(getINTAND(key));
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            return (getLazyArray(key >> COL_BIAS)[getColIndex(key)] & getINTAND(key)) != 0;
        }

        private int getColIndex(int key) {
            return (key >> INT_LENGTH_BIAS) & COL_AND;
        }

        private int[] getLazyArray(int i) {
            if (map[i] == null) {
                map[i] = new int[COL];
            }
            return map[i];
        }
    }


}
