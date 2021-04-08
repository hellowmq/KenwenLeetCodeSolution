package com.wenmq.cn.leetcode;

/**
 * Q868
 * https://leetcode-cn.com/problems/binary-gap/
 */
public class Solution868 {
    /**
     * 利用 n ^ (n - 1) 的二进制性质，逐级跳跃
     * 可惜，求最高位位置的复杂度无法降低，否则
     */
    public int binaryGap(int n) {
        int res = 0;
        int tmp;
        n /= (n ^ (n - 1)) + 1;
        while (n > 0) {
            // 暴力的也可以用 String.valueOf((n ^ (n - 1)) + 1).length()
            tmp = (int) (Math.log((n ^ (n - 1)) + 1) / Math.log(2));
            res = Math.max(tmp, res);
            n >>= tmp;
        }
        return res;
    }

    /**
     * 从最低位开始，逐个遍历计数
     */
    public int binaryGap2(int n) {
        int res = 0;
        int tmp = 0;
        while ((n & 1) != 1) {
            //先找到第一个1
            n >>= 1;
        }
        while (n > 0) {
            if ((n & 1) == 1) {
                //更新结果
                res = Math.max(tmp, res);
                tmp = 0;
            }
            tmp++;
            n >>= 1;
        }
        return res;
    }

}
