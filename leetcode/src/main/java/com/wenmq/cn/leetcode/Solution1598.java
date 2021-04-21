package com.wenmq.cn.leetcode;

/**
 * Q1598
 * https://leetcode-cn.com/problems/crawler-log-folder/
 */
public class Solution1598 {
    /**
     * 1 <= logs.length <= 103
     * 2 <= logs[i].length <= 10
     * logs[i] 包含小写英文字母，数字，'.' 和 '/'
     * logs[i] 符合语句中描述的格式
     * 文件夹名称由小写英文字母和数字组成
     */
    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    //ignore
                    break;
                case "../":
                    if (count == 0) {
                        continue;
                    }
                    count--;
                    break;
                default:
                    count++;
            }
        }
        return count;
    }

}
