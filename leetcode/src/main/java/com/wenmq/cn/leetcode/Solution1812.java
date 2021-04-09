package com.wenmq.cn.leetcode;

/**
 * Q1812
 * https://leetcode-cn.com/problems/determine-color-of-a-chessboard-square/
 */
public class Solution1812 {
    /**
     * 自然而然的想法是考虑 index 的奇偶性
     * 这里的字符本身的 ASCII 码本身就具有 index 奇偶性的特征
     */
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - coordinates.charAt(1)) & 1) == 1;
    }

}
