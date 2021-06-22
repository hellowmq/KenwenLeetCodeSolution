package com.wenmq.cn.leetcode;

/**
 * Q771
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class Solution771 {
    /**
     * S 和 J 最多含有50个字母。
     * J 中的字符不重复。
     */
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] set = new boolean['z' - 'A' + 1];
        for (int i = 0; i < jewels.length(); i++) {
            set[jewels.charAt(i) - 'A'] = true;
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set[stones.charAt(i) - 'A']) {
                count++;
            }
        }
        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        long set = 0;
        for (int i = 0; i < jewels.length(); i++) {
            set |= 1L << (jewels.charAt(i) - 'A');
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if ((set & (1L << (stones.charAt(i) - 'A'))) != 0) {
                count++;
            }
        }
        return count;
    }

}
