package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-number-of-words-you-can-type/">
 * Q1935
 * </a>
 */
public class Solution1935 {
    /**
     * 1 <= text.length <= 10^4
     * 0 <= brokenLetters.length <= 26
     * text 由若干用单个空格分隔的单词组成，且不含任何前导和尾随空格
     * 每个单词仅由小写英文字母组成
     * brokenLetters 由 互不相同 的小写英文字母组成
     */
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] strings = text.split(" ");
        int filter = 0;
        for (int i = 0; i < brokenLetters.length(); i++) {
            filter |= 1 << (brokenLetters.charAt(i) - 'a');
        }
        int count = strings.length;
        for (String s : strings) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if ((filter & (1 << (c - 'a'))) != 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    /**
     * char
     */
    public int canBeTypedWords2(String text, String brokenLetters) {
        int filter = 0;
        for (int i = 0; i < brokenLetters.length(); i++) {
            filter |= 1 << (brokenLetters.charAt(i) - 'a');
        }
        char[] chars1 = (text + ' ').toCharArray();
        int index = 0;
        int count = 0;
        boolean broken = false;
        while (index < chars1.length) {
            if (chars1[index] == ' ') {
                if (!broken) {
                    count++;
                }
                broken = false;
            } else if ((filter & (1 << (chars1[index] - 'a'))) != 0) {
                broken = true;
            }
            index++;

        }
        return count;
    }

}
