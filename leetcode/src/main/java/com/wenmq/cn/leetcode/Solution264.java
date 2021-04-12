package com.wenmq.cn.leetcode;

/**
 * Q264
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution264 {

    public int nthUglyNumber(int n) {
        return Ugly.getInstance().getNthUgly(n);
    }

    static final class Ugly {

        private static Ugly _instance;
        private int[] mDp;

        private Ugly() {
            init();
        }

        private void init() {
            mDp = new int[1700];
            int i2 = 1;
            int i3 = 1;
            int i5 = 1;
            mDp[1] = 1;
            for (int i = 2; i < mDp.length; i++) {
                mDp[i] = Math.min(Math.min(mDp[i2] * 2, mDp[i3] * 3), mDp[i5] * 5);
                if (mDp[i] == mDp[i2] * 2) {
                    i2++;
                }
                if (mDp[i] == mDp[i3] * 3) {
                    i3++;
                }
                if (mDp[i] == mDp[i5] * 5) {
                    i5++;
                }
            }
        }

        int getNthUgly(int n) {
            return mDp[n];
        }

        static Ugly getInstance() {
            if (_instance == null) {
                synchronized (Ugly.class) {
                    if (_instance == null) {
                        _instance = new Ugly();
                    }
                }
            }
            return _instance;
        }
    }

}
