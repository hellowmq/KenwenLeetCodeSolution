package com.wenmq.leetcode;

/**
 * 1030
 * https://leetcode-cn.com/problems/matrix-cells-in-distance-order/
 */
public class Solution1030 {
    final int[] dr = {1, 1, -1, -1};
    final int[] dc = {1, -1, -1, 1};

    /**
     * allCellsDistOrder
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int maxDist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        int[][] ret = new int[R * C][];
        int row = r0;
        int col = c0;
        int index = 0;
        ret[index++] = new int[]{row, col};
        for (int dist = 1; dist <= maxDist; dist++) {
            row--;
            for (int i = 0; i < 4; i++) {
                while (
                        (i % 2 == 0 && row != r0)
                                || (i % 2 != 0 && col != c0)) {
                    if (row >= 0
                            && row < R
                            && col >= 0
                            && col < C) {
                        ret[index++] = new int[]{row, col};
                    }
                    row += dr[i];
                    col += dc[i];
                }
            }
        }
        return ret;
    }

}
