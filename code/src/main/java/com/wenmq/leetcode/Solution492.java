package com.wenmq.leetcode;

/**
 * Q492
 * https://leetcode-cn.com/problems/construct-the-rectangle/
 */
public class Solution492 {

    /**
     * 假想的情况是 L == M
     * 先找到平方根，向下寻找公因数
     * @param area 面积
     * @return [L,W] ; L >= W
     */
    public int[] constructRectangle(int area) {
        int[] array = new int[2];
        int num = (int) Math.sqrt(area);
        while (num > 0) {
            if (area % num == 0) {
                break;
            }
            num--;
        }
        array[0] = area / num;
        array[1] = num;
        return array;
    }

}
