package com.wenmq.cn.leetcode;

/**
 * Q520
 * https://leetcode-cn.com/problems/detect-capital/
 */
public class Solution520 {
    /**
     * 两种情况返回 false
     * 1. 只要后续混乱必然不通过
     * 2. 首字母小写，之后大写
     */
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        boolean firstUpper = Character.isUpperCase(word.charAt(0));
        boolean oneCase = Character.isUpperCase(word.charAt(1));
        for (int i = 2; i < word.length(); i++) {
            if (oneCase != Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return firstUpper || !oneCase;
    }

}
