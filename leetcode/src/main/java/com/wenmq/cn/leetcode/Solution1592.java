package com.wenmq.cn.leetcode;

/**
 * Q1592
 * https://leetcode-cn.com/problems/rearrange-spaces-between-words/
 */
public class Solution1592 {
    /**
     * 1 <= text.length <= 100
     * text 由小写英文字母和 ' ' 组成
     * text 中至少包含一个单词
     */
    public String reorderSpaces(String s) {
        char[] a = s.toCharArray();
        int space = a[0] == ' ' ? 1 : 0;
        int word = a[0] == ' ' ? 0 : 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == ' ') {
                space++;
            } else if (a[i - 1] == ' ') {
                word++;
            }
        }
        int avgSpace = word == 1 ? 0 : space / (word - 1);
        int tailSpace = word == 1 ? space : space % (word - 1);
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0, j, cnt = 0; i < a.length; i = j, i++) {
            //i=j
            for (j = i; j < a.length && a[j] != ' '; j++) {
                sb.append(a[j]);
            }
            if (j != i && ++cnt != word) {
                for (int k = 0; k < avgSpace; k++) {
                    sb.append(' ');
                }
            }
        }
        for (int i = 0; i < tailSpace; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
