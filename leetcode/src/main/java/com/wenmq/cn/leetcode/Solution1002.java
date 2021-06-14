package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q1002
 * https://leetcode-cn.com/problems/find-common-characters/
 */
public class Solution1002 {

    public static final int ALPHABET_LENGTH = 26;

    /**
     * 1 <= A.length <= 100
     * 1 <= A[i].length <= 100
     * A[i][j] 是小写字母
     */
    public List<String> commonChars(String[] words) {
        byte[] commonSet = getBytes(words[0]);
        byte[] collectSet;
        for (int j = 1; j < words.length; j++) {
            String word = words[j];
            collectSet = getBytes(word);
            intersectBytes(commonSet, collectSet);
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < commonSet.length; i++) {
            while (commonSet[i]-- > 0) {
                strings.add(String.valueOf((char) ('a' + i)));
            }
        }
        return strings;
    }

    private static byte[] getBytes(String word) {
        byte[] collectSet = new byte[ALPHABET_LENGTH];
        for (int i = 0; i < word.length(); i++) {
            collectSet[word.charAt(i) - 'a']++;
        }
        return collectSet;
    }

    private static void intersectBytes(byte[] origin, byte[] branch) {
        for (int i = 0; i < ALPHABET_LENGTH; i++) {
            origin[i] = (byte) Math.min(origin[i], branch[i]);
        }
    }


}
