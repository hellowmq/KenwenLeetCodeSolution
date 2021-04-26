package com.wenmq.cn.leetcode;

/**
 * Q1662
 * https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class Solution1662 {
    /**
     * 1 <= word1.length, word2.length <= 10^3
     * 1 <= word1[i].length, word2[i].length <= 10^3
     * 1 <= sum(word1[i].length), sum(word2[i].length) <= 10^3
     * 根据 Index 越界情况同步更新比较的指针
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int[] wordIndex = {0, 0};
        int[] charIndex = {0, 0};
        while (wordIndex[0] < word1.length && wordIndex[1] < word2.length) {
            if (word1[wordIndex[0]].charAt(charIndex[0]) != word2[wordIndex[1]].charAt(charIndex[1])) {
                return false;
            }
            charIndex[0]++;
            if (charIndex[0] >= word1[wordIndex[0]].length()) {
                charIndex[0] = 0;
                wordIndex[0]++;
            }
            charIndex[1]++;
            if (charIndex[1] >= word2[wordIndex[1]].length()) {
                charIndex[1] = 0;
                wordIndex[1]++;
            }
        }
        return wordIndex[0] == word1.length && wordIndex[1] == word2.length;
    }


    /**
     * 先拼接，后比较
     * 实际上用了O(N)的开销，比较的复杂度也无法降低
     * 对于只有开头不同的超长字符串尤为严重
     */
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        if (word1[0].charAt(0) != word2[0].charAt(0)) {
            return false;
        }
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String str : word1) {
            str1.append(str);
        }
        for (String str : word2) {
            str2.append(str);
        }
        return str1.toString().equals(str2.toString());
    }

}
