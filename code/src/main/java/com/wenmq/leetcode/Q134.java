package com.wenmq.leetcode;

/**
 * Q134
 * https://leetcode-cn.com/problems/gas-station/
 */
public class Q134 {
    static class Solution {

        public int canCompleteCircuit(int[] gas, int[] cost) {
            int total = 0;
            int part = 0;
            int start = 0;
            for (int i = 0; i < gas.length; ++i) {
                part += (gas[i] - cost[i]);
                total += (gas[i] - cost[i]);
                if (part < 0) {
                    start = i + 1;
                    part = 0;
                }
            }
            if (total < 0) return -1;
            return start;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(solution.canCompleteCircuit(gas, cost));
        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        System.out.println(solution.canCompleteCircuit(gas2, cost2));

    }

}
