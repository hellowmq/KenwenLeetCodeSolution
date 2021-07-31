package com.wenmq.cn.leetcode;

/**
 * Q1832
 * https://leetcode-cn.com/problems/check-if-the-sentence-is-pangram/
 */
public class Solution1832 {
    /**
     * 1 <= sentence.length <= 1000
     * sentence 由小写英语字母组成
     */
    public boolean checkIfPangram(String sentence) {
        int set = 0;
        for (int i = 0; i < sentence.length(); i++) {
            set |= 1 << (sentence.charAt(i) - 'a');
            if (set == 0x3ffffff) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfPangram2(String sentence) {
        char[] chars = sentence.toCharArray();
        int set = 0;
        for (char c : chars) {
            set |= 1 << (c & 0x3f);
            if (set == 0x7fffffe) {
                return true;
            }
        }
        return false;
    }

}
