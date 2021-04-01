package com.wenmq.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Q1046
 * https://leetcode-cn.com/problems/last-stone-weight/
 */
public class Solution1046 {
    /**
     * 依照题意
     * 自然而然会想到一个使用大顶堆的做法
     */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (int i : stones) {
            pq.offer(i);
        }
        while (pq.size() >= 2) {

            int x = pq.poll();
            int y = pq.poll();
            if (x > y) {
                pq.offer(x - y);
            }
        }
        return pq.size() == 1 ? pq.peek() : 0;
    }


    /**
     * 离谱的是，这种暴力做法竟然跑赢 100% 耗时
     */
    public int lastStoneWeight2(int[] stones) {
        int len = stones.length;
        if (len == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        // 中止条件，stones[i-2]=0
        while (stones[len - 2] != 0) {
            stones[len - 1] -= stones[len - 2];
            stones[len - 2] = 0;
            Arrays.sort(stones);
        }
        return stones[len - 1];
    }
}
