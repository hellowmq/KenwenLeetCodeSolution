package com.wenmq.cn.leetcode;


/**
 * Q1768
 * https://leetcode-cn.com/problems/merge-strings-alternately/
 * 1 <= word1.length, word2.length <= 100
 * word1 和 word2 由小写英文字母组成
 */
public class Solution1768 {
    /**
     * 避开 StringBuilder 的长度判断
     * @see String#substring(int)
     * 最后通过数组一次构建
     *
     */
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        char[] array = new char[length1 + length2];
        int length = Math.max(length1, length2);
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (i < length1) {
                array[index++] = word1.charAt(i);
            }
            if (i < length2) {
                array[index++] = word2.charAt(i);
            }
        }
        return String.valueOf(array);
    }

    /**
     * StringBuilder
     * 1 <= word1.length, word2.length <= 100
     * word1 和 word2 由小写英文字母组成
     */
    public String mergeAlternately2(String word1, String word2) {
        StringBuilder builder = new StringBuilder(word1.length() + word2.length());
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(i));
        }
        builder.append(word1.substring(length));
        builder.append(word2.substring(length));
        return builder.toString();
    }

}
