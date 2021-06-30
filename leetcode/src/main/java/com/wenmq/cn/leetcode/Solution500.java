package com.wenmq.cn.leetcode;

import java.util.ArrayList;

/**
 * Q500
 * https://leetcode-cn.com/problems/keyboard-row/
 */
public class Solution500 {
    static final int QWER = 0x2b7_8220;
    static final int ASDF = 0x8_1dd2;
    static final int ZXCV = 0x540_600c;

    /**
     * 1 <= words.length <= 20
     * 1 <= words[i].length <= 100
     * words[i] 由英文字母（小写和大写字母）组成
     */
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : words) {
            if (checkOnly(str)) {
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }

    static boolean checkOnly(String s) {
        int set = 0;
        for (int i = 0; i < s.length(); i++) {
            set |= 1 << (s.charAt(i) & 0x3f);
        }
        return ((set & ~QWER) == 0 || (set & ~ASDF) == 0 || (set & ~ZXCV) == 0);
    }

}
