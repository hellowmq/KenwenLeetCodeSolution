package com.wenmq.cn.leetcode;

/**
 * Q1275
 * https://leetcode-cn.com/problems/find-winner-on-a-tic-tac-toe-game/
 */
public class Solution1275 {
    /**
     * 1 <= moves.length <= 9
     * moves[i].length == 2
     * 0 <= moves[i][j] <= 2
     * moves 里没有重复的元素。
     * moves 遵循井字棋的规则。
     */
    @SuppressWarnings("SpellCheckingInspection")
    public String tictactoe(int[][] moves) {
        int m = moves.length;
        int[] checker = new int[8];
        for (int i = m - 1; i >= 0; i -= 2) {
            checker[moves[i][0]]++;
            checker[moves[i][1] + 3]++;
            if (moves[i][0] == moves[i][1]) {
                checker[6]++;
            }
            if (moves[i][0] + moves[i][1] == 2) {
                checker[7]++;
            }
            if (checker[moves[i][0]] == 3
                    || checker[moves[i][1] + 3] == 3
                    || checker[6] == 3
                    || checker[7] == 3) {
                return m % 2 == 0 ? "B" : "A";
            }
        }
        return moves.length < 9 ? "Pending" : "Draw";
    }

}
