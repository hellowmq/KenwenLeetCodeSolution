package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Q1442
 * https://leetcode-cn.com/problems/maximum-gap/
 */
public class Solution1442 {

    /**
     * 这里的运算精髓在于 biasMap 的含义；
     * 在动态规划的演算过程中，遍历到一个已存在的 XOR 需要增加的 sum 值是很难计算的
     * 这里用一个 biasMap 来把 ∑(K - Ii) 分解为 count * K -  ∑(Ii)
     */
    public int countTriplets(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>(arr.length);
        Map<Integer, Integer> biasMap = new HashMap<>(arr.length);
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

    /**
     * Actually  a ^ b == 0
     *
     * @param arr input
     * @return num of success;
     */
    public int countTriplets2(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            int xorN = arr[i];
            for (int k = i + 1; k < arr.length; ++k) {
                xorN ^= arr[k];
                if (xorN == 0) {
                    res += (k - i);
                }
            }
        }
        return res;
    }

    /**
     * 原地修改
     */
    public int countTriplets3(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int ans = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                ans ^= arr[k];
                if (ans == 0) {
                    count += k - i;
                }
            }
        }
        return count;
    }


}
