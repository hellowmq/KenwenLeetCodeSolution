package com.wenmq.cn.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Q1619
 * https://leetcode-cn.com/problems/mean-of-array-after-removing-some-elements/
 */
public class Solution1619 {
    /**
     * 20 <= arr.length <= 1000
     * arr.length 是 20 的 倍数
     * 0 <= arr[i] <= 105
     */
    public double trimMean(int[] arr) {
        double mean = 0;
        Arrays.sort(arr);
        int start = (int) (arr.length * 0.05);
        int end = (int) (arr.length * (1 - 0.05));
        for (int i = start; i < end; i++) {
            mean += arr[i];
        }
        mean = mean / (end - start);
        mean = (double) Math.round(mean * 100000) / 100000;
        return mean;
    }

    /**
     * 20 <= arr.length <= 1000
     * arr.length 是 20 的 倍数
     * 0 <= arr[i] <= 105
     */
    public double trimMean2(int[] arr) {
        int length = arr.length / 20;
        int small = sort(arr, length, new PriorityQueue<>(length, (o1, o2) -> o1 - o2));
        int large = sort(arr, length, new PriorityQueue<>(length, (o1, o2) -> o2 - o1));
        double sum = -small - large;
        for (int a : arr) {
            sum += a;
        }
        return sum / length / 18;
    }

    private int sort(int[] arr, int length, PriorityQueue<Integer> queue) {
        for (int i = 0; i < arr.length; i++) {
            if (i < length) {
                queue.offer(arr[i]);
                continue;
            }
            Integer peek = queue.peek();
            Comparator<? super Integer> comparator = queue.comparator();
            if (comparator.compare(arr[i], peek) > 0) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        int sum = 0;
        for (Integer a : queue) {
            sum += a;
        }
        return sum;
    }
}
