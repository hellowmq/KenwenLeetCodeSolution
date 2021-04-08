package com.wenmq.cn.leetcode;

/**
 * Q1486
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 */
public class Solution1486 {
    /**
     * 公差为 2 的等差数列
     * -> 连续整数的数组（公差为 1）异或
     * -> 两个前 N 项运算之"差"
     */
    public int xorOperation(int n, int start) {
        int xorTop = getXorResult(n + (start >> 1) - 1);
        int xorBot = (getXorResult((start >> 1) - 1));
        return ((xorTop ^ xorBot) << 1 | (start & n & 1));
    }

    /**
     * 连续异或的规律
     */
    public int getXorResult(int p) {
        if (p < 0) {
            return 0;
        }
        switch (p & 3) {
            case 0:
                return p;
            case 1:
                return 1;
            case 2:
                return p + 1;
            default:
                return 0;
        }
    }

}
