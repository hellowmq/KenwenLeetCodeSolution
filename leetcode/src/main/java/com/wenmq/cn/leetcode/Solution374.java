package com.wenmq.cn.leetcode;

/**
 * Q374
 * https://leetcode-cn.com/problems/guess-number-higher-or-lower/
 */
public class Solution374 {

    /**
     * Forward declaration of guess API.
     *
     * num your guess
     * * -1 if num is lower than the guess number
     * * 1 if num is higher than the guess number
     * * otherwise return 0
     * int guess(int num);
     */
    public static class Solution extends GuessGame {
        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            int mid = left;
            while (left <= right) {
                mid = left + (right - left) / 2;
                int result = guess(mid);
                if (result > 0) {
                    left = mid + 1;
                } else if (result < 0) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return mid;
        }
    }

    static class GuessGame {
        Comparable<Integer> mGuessAble;

        void setGuessAble(Comparable<Integer> guessAble) {
            mGuessAble = guessAble;
        }

        /**
         * Forward declaration of guess API.
         *
         * @param num your guess
         * @return -1 if num is lower than the guess number
         * 1 if num is higher than the guess number
         * otherwise return 0
         * int guess(int num);
         */
        int guess(int num) {
            return mGuessAble.compareTo(num);
        }

    }
}
