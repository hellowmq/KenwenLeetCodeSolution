package com.wenmq.cn.leetcode;

import java.util.HashSet;

/**
 * Q1496
 * https://leetcode-cn.com/problems/path-crossing/
 */
public class Solution1496 {

    public static final int BIAS = 1 << 16;

    /**
     * 1 <= path.length <= 10^4
     * path 仅由 {'N', 'S', 'E', 'W} 中的字符组成
     */
    public boolean isPathCrossing(String path) {
        int position = 0;
        HashSet<Integer> set = new HashSet<>(path.length());
        set.add(position);
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    position++;
                    break;
                case 'S':
                    position--;
                    break;
                case 'E':
                    position += BIAS;
                    break;
                case 'W':
                    position -= BIAS;
                    break;
                default:
                    // ignore
            }
            if (!set.add(position)) {
                return true;
            }
        }
        return false;
    }

}
