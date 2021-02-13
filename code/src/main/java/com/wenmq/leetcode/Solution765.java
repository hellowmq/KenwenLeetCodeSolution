package com.wenmq.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Q765
 * https://leetcode-cn.com/problems/couples-holding-hands/
 */
public class Solution765 {
    /**
     * 方法一：保留奇数位，用偶数位与匹配交换
     */
    public int minSwapsCouples(int[] row) {
        int result = 0;
        for (int i = 0; i < row.length; i = i + 2) {
            if ((row[i] ^ row[i + 1]) == 1) {
                continue;
            }
            int index = i + 2;
            while ((index < row.length) && ((row[i + 1] ^ row[index]) != 1)) {
                index++;
            }
            int temp = row[index];
            row[index] = row[i];
            row[i] = temp;
            result++;
        }
        return result;
    }

    /**
     * 官方题解并查集：
     * https://leetcode-cn.com/problems/couples-holding-hands/solution/qing-lu-qian-shou-by-leetcode-solution-bvzr/
     */
    public int minSwapsCouples2(int[] row) {
        return new ExtraSolution().minSwapsCouples(row);
    }


    static class ExtraSolution {
        public int minSwapsCouples(int[] row) {
            int len = row.length;
            int pairNum = len >> 1;
            int[] f = initArrayF(pairNum);
            addEdge(row, len, f);
            Map<Integer, Integer> map = initMap(pairNum, f);
            return calculateRet(map);
        }

        private int calculateRet(Map<Integer, Integer> map) {
            int ret = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ret += entry.getValue() - 1;
            }
            return ret;
        }

        private Map<Integer, Integer> initMap(int pairNum, int[] f) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < pairNum; i++) {
                int fx = getF(f, i);
                map.put(fx, map.getOrDefault(fx, 0) + 1);
            }
            return map;
        }

        private void addEdge(int[] row, int len, int[] f) {
            for (int i = 0; i < len; i += 2) {
                int l = row[i] >> 1;
                int r = row[i + 1] >> 1;
                add(f, l, r);
            }
        }

        private int[] initArrayF(int pairNum) {
            int[] f = new int[pairNum];
            for (int i = 0; i < pairNum; i++) {
                f[i] = i;
            }
            return f;
        }

        private int getF(int[] f, int k) {
            if (f[k] == k) {
                return k;
            }
            f[k] = getF(f, f[k]);
            return f[k];
        }

        private void add(int[] f, int x, int y) {
            int fx = getF(f, x);
            f[fx] = getF(f, y);
        }
    }


}
