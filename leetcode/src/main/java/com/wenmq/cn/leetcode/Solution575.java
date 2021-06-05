package com.wenmq.cn.leetcode;

/**
 * Q575
 * https://leetcode-cn.com/problems/distribute-candies/
 */
public class Solution575 {
    /**
     * 数组的长度为[2, 10,000]，并且确定为偶数。
     * 数组中数字的大小在范围[-100,000, 100,000]内。
     * 位运算优化数组空间
     */
    public int distributeCandies(int[] candyType) {
        int half = candyType.length >> 1;
        /// 8k * 32 = 256k
        int[] types = new int[1 << 13];
        int ans = 0;
        for (int type : candyType) {
            int index = type + (1 << 17);
            if ((types[index >> 5] & 1 << (index & 31)) == 0) {
                ans++;

                if (ans == half) {
                    return ans;
                }
            }
            types[index >> 5] |= 1 << (index & 31);
        }
        return ans;
    }

    public int distributeCandies2(int[] candyType) {
        int half = candyType.length / 2;
        boolean[] types = new boolean[200001];
        int ans = 0;
        for (int type : candyType) {
            if (!types[type + 100000]) {
                ans++;
                if (ans == half) {
                    return ans;
                }
            }
            types[type + 100000] = true;
        }
        return ans;
    }

}
