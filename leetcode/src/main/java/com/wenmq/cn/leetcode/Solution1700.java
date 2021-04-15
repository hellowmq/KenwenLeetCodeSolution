package com.wenmq.cn.leetcode;

/**
 * Q1700
 * https://leetcode-cn.com/problems/number-of-students-unable-to-eat-lunch/
 */
public class Solution1700 {
    /**
     * 遍历，统计
     */
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];
        for (int student : students) {
            counts[student]++;
        }
        for (int sandwich : sandwiches) {
            if (counts[sandwich] <= 0) {
                break;
            }
            counts[sandwich]--;
        }
        return counts[0] + counts[1];

    }

}
