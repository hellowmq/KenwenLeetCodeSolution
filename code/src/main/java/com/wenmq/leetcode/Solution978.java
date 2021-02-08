package com.wenmq.leetcode;

/**
 * Q978
 * https://leetcode-cn.com/problems/longest-turbulent-subarray/
 */
public class Solution978 {
    /**
     * 方法一：
     */
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length < 2) return 1;
        int curNum = arr[0] != arr[1] ? 2 : 1;
        int max = curNum;
        // 下一个比较是否应该是大于号
        boolean nextBigger = arr[0] > arr[1];
        for (int i = 2; i < arr.length; i++){
            if ((nextBigger && arr[i] > arr[i - 1]) || (!nextBigger && arr[i] < arr[i - 1])) {
                curNum++;
                nextBigger = !nextBigger;
                max = Math.max(max, curNum);
            }
            else {
                curNum = arr[i] != arr[i - 1] ? 2 : 1;
            }
        }
        return max;
    }

    /**
     * 方法二
     */
    public void solution2() {
    }


}
