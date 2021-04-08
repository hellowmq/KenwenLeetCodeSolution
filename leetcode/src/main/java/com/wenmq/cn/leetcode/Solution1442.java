package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Q1442
 * https://leetcode-cn.com/problems/maximum-gap/
 */
public class Solution1442 {
    /**
     * Actually  a ^ b == 0
     *
     * @param arr input
     * @return num of success;
     */
    public int countTriplets2(int[] arr) {
        int sum = 0;
        int[] norArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            norArray[i + 1] = (norArray[i] ^ arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length + 1; k++) {
                if (norArray[i] == norArray[k]) {
                    sum += k - i - 1;
                }
            }
        }
        return sum;
    }

    /**
     * 这里的运算精髓在于 biasMap 的含义；
     * 在动态规划的演算过程中，遍历到一个已存在的 XOR 需要增加的 sum 值是很难计算的
     * 这里用一个 biasMap 来把 ∑(K - Ii) 分解为 count * K -  ∑(Ii)
     */
    public int countTriplets(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> biasMap = new HashMap<>();
        countMap.put(0, 1);
        biasMap.put(0, 0);
        int sum = 0;
        int xorInt = 0;
        for (int k = 0; k < arr.length; k++) {
            xorInt ^= arr[k];
            if (countMap.containsKey(xorInt)) {
                sum += countMap.get(xorInt) * k - biasMap.get(xorInt);
            }
            countMap.put(xorInt, countMap.getOrDefault(xorInt, 0) + 1);
            biasMap.put(xorInt, biasMap.getOrDefault(xorInt, 0) + k + 1);
        }
        return sum;
    }


}
