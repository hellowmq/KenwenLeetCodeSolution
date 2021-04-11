package com.wenmq.cn.leetcode;

/**
 * Q1742
 * https://leetcode-cn.com/problems/maximum-number-of-balls-in-a-box/
 */
public class Solution1742 {


    /**
     * 不是我写的
     * 建议好好研读这个提交
     */
    public int countBalls(int lowLimit, int highLimit) {
        SolutionImpl impl = new SolutionImpl();
        int[] cs = new int[impl.cLen(highLimit + 1)];
        int maxV = impl.counts(cs, lowLimit, highLimit + 1);
        int res = 0;
        for (int v = 1; v < maxV; v++) {
            res = Math.max(res, cs[v]);
        }
        return res;
    }

    static class SolutionImpl {
        int sumDs(int v) {
            int s = 0;
            for (; v != 0; v /= 10) {
                s += v % 10;
            }
            return s;
        }

        int cLen(int v) {
            int len = 1;
            int p = 1;
            for (; p < v; p *= 10) {
                len += 9;
            }
            return len;
        }

        int counts(int[] cs, int from, int to) {
            if (from + 10 >= to) {
                for (int v = from; v < to; v++) {
                    cs[sumDs(v)]++;
                }
                return cLen(to);
            }
            int fromD10 = from / 10;
            int tod10 = to / 10;
            int maxV = counts(cs, fromD10, tod10) + 9;
            int s = 0;
            int v0 = 0;
            for (int v = maxV - 1; v >= 0; v--) {
                s -= v0;
                v0 = cs[v];
                if (v >= 9) {
                    s += cs[v - 9];
                }
                cs[v] = s;
            }
            for (int v = fromD10 * 10; v < from; v++) {
                cs[sumDs(v)]--;
            }
            for (int v = tod10 * 10; v < to; v++) {
                cs[sumDs(v)]++;
            }
            return maxV;
        }
    }


    /**
     * 粗暴的统计，只适用于小样本
     */
    public int countBalls2(int lowLimit, int highLimit) {
        int[] ans = new int[46];
        int max = Integer.MIN_VALUE;
        for (int i = lowLimit; i <= highLimit; i++) {
            int box = 0;
            int ball = i;
            while (ball > 0) {
                box += ball % 10;
                ball /= 10;
            }
            max = Math.max(max, ++ans[box]);
        }
        return max;
    }
}
