package com.wenmq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q118
 * https://leetcode-cn.com/problems/pascals-triangle/
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();
        if (numRows < 1) {
            return matrix;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                    continue;
                }
                int left = matrix.get(i - 1).get(j - 1);
                int right = matrix.get(i - 1).get(j);
                list.add(left + right);
            }
            matrix.add(list);
        }
        return matrix;

    }


    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int[][] arr = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                subList.add(arr[i][j]);
            }
            list.add(subList);
        }
        return list;
    }

}
