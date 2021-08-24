package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/koko-eating-bananas/">
 * Q875
 * </a>
 */
public class Solution875 {
    /**
     * 1 <= piles.length <= 10^4
     * piles.length <= H <= 10^9
     * 1 <= piles[i] <= 10^9
     */
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = 0;
        if (piles.length < 50) {
            for (int pile : piles) {
                maxPiles = Math.max(maxPiles, pile);
            }
        } else {
            maxPiles = 1000000001;
        }
        int left = 1;
        int right = maxPiles;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (getCount(piles, mid) > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int getCount(int[] piles, int mid) {
        int count = 0;
        for (int pile : piles) {
            count += (pile - 1) / mid + 1;
        }
        return count;
    }

//    template
//    public int minEatingSpeed(int[] piles, int H) {
//        int left = 1;
//        int right = 1000000000 + 1;
//
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (f(piles, mid) <= H) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
// 定义：速度为 x 时，需要 f(x) 小时吃完所有香蕉
// f(x) 随着 x 的增加单调递减
// int f(int[] piles, int x) {
//    int hours = 0;
//    for (int i = 0; i < piles.length; i++) {
//        hours += piles[i] / x;
//        if (piles[i] % x > 0) {
//            hours++;
//        }
//    }
//    return hours;
//}
}
