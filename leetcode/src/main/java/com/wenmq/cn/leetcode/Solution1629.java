package com.wenmq.cn.leetcode;

/**
 * Q1629
 * https://leetcode-cn.com/problems/slowest-key/
 */
public class Solution1629 {
    /**
     * releaseTimes.length == n
     * keysPressed.length == n
     * 2 <= n <= 1000
     * 1 <= releaseTimes[i] <= 109
     * releaseTimes[i] < releaseTimes[i+1]
     * keysPressed 仅由小写英文字母组成
     */
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int releaseTime = releaseTimes[0];
        char maxLargestChar = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int timeLen = releaseTimes[i] - releaseTimes[i - 1];
            char newChar = keysPressed.charAt(i);
            if (releaseTime == timeLen && maxLargestChar < newChar) {
                maxLargestChar = newChar;
            } else if (releaseTime < timeLen) {
                releaseTime = timeLen;
                maxLargestChar = newChar;
            }
        }
        return maxLargestChar;
    }

}
