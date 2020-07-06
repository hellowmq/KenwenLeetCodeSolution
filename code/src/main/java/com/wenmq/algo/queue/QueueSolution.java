package com.wenmq.algo.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ifans.wen
 * @date 2020/7/3
 * @description
 */
public class QueueSolution {

    public int kthSmallest(int[][] matrix, int k) {
//        the int [] contains three value [data, row, column]
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int n = matrix.length;
        for (int col = 0; col < n; col++) {
            pq.offer(new int[]{matrix[col][0], col, 0});
        }
        for (int i = 0; i < k - 1; i++) {
            int[] now = pq.poll();
            if (now[2] != n - 1) {
//                end of the row
                pq.offer(new int[]{matrix[now[1]][now[2] + 1], now[1], now[2] + 1});
            }
        }
        return pq.poll()[0];
    }


    public int smallK(int[][] matrix, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] v1, int[] v2) {
                return v1[0] - v2[0];
            }
        });

        int n = matrix.length;
        int n2 = matrix[0].length;
        for (int col = 0; col < n; col++) {
            priorityQueue.offer(new int[]{matrix[col][0], col, 0});
        }
        int sortedL[] = new int[k];
        for (int i = 0; i < k; i++) {
            int[] out = priorityQueue.poll();
            sortedL[i] = out[0];
            if (out[2] != n2 - 1) {
                priorityQueue.offer(new int[]{matrix[out[1]][out[2] + 1], out[1], out[2] + 1});
            }
        }
        return sortedL[k - 1];


    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println((new QueueSolution().kthSmallest(matrix, 8)));
    }
}
