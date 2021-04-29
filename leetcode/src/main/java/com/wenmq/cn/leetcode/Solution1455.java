package com.wenmq.cn.leetcode;

/**
 * Q1455
 * https://leetcode-cn.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 */
public class Solution1455 {
    /**
     * 1 <= sentence.length <= 100
     * 1 <= searchWord.length <= 10
     * sentence 由小写英文字母和空格组成。
     * searchWord 由小写英文字母组成。
     * 前缀就是紧密附着于词根的语素，中间不能插入其它成分，并且它的位置是固定的——-位于词根之前。
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

}
