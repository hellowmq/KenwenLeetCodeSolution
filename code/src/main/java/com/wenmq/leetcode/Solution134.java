package com.wenmq.leetcode;

/**
 * Q134
 * https://leetcode-cn.com/problems/gas-station/
 */
public class Solution134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int part = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int res = gas[i] - cost[i];
            part += res;
            total += res;
            if (part < 0) {
                start = i + 1;
                part = 0;
            }
        }
        if (total < 0) {
            return -1;
        }
        return start;
    }
}
