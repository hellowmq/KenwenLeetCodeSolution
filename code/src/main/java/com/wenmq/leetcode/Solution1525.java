package com.wenmq.leetcode;

/**
 * Q1525
 * https://leetcode-cn.com/problems/number-of-good-ways-to-split-a-string/
 */
public class Solution1525 {
    /**
     * 先统计，后移除的方式
     */
    public int numSplits2(String s) {
        int res = 0;
        int left = 0;
        int right = 0;
        int[] numsRight = new int[26];
        int[] numsLeft = new int[26];
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            int c = aChar - 'a';
            if (numsRight[c] == 0) {
                right++;
            }
            numsRight[c]++;
        }

        for (char aChar : chars) {
            int c = aChar - 'a';
            if (numsLeft[c] == 0) {
                left++;
            }
            numsLeft[c]++;
            numsRight[c]--;
            if (numsRight[c] == 0) {
                right--;
            }

            if (left == right) {
                res++;
            }
        }

        return res;
    }


    /**
     * numSplits
     */
    public int numSplits(String s) {
        int res = 0;
        int left = 0;
        int right = 0;
        int[] numsRight = new int[26];
        int[] numsLeft = new int[26];
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            int c = aChar - 'a';
            if (numsRight[c] == 0) {
                right++;
            }
            numsRight[c]++;
        }

        for (char aChar : chars) {
            int c = aChar - 'a';
            if (numsLeft[c] == 0) {
                left++;
            }
            numsLeft[c]++;
            numsRight[c]--;
            if (numsRight[c] == 0) {
                right--;
            }

            if (left == right) {
                res++;
            }
        }

        return res;
    }


}
