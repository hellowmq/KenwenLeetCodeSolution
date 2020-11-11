package com.wenmq.lcp;

/**
 * 小扣注意到秋日市集上有一个创作黑白方格画的摊位。摊主给每个顾客提供一个固定在墙上的白色画板，画板不能转动。画板上有 n * n 的网格。绘画规则为，小扣可以选择任意多行以及任意多列的格子涂成黑色，所选行数、列数均可为 0。
 *
 * 小扣希望最终的成品上需要有 k 个黑色格子，请返回小扣共有多少种涂色方案。
 *
 * 注意：两个方案中任意一个相同位置的格子颜色不同，就视为不同的方案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ccw6C7
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class LCP22 {

    static class Solution {
        public int paintingPlan(int n, int k) {
            int left = n * n - k;
            if (left == 0 || k == 0) return 1;
            int sum = 0;
            for (int whiteCol = 1, whiteRow = 0; whiteCol <= n; whiteCol++) {
                whiteRow = left / whiteCol;
                if (left % whiteCol == 0 && whiteRow <= n) {
                    int cmn = combination(whiteCol, n) * combination(whiteRow, n);
                    sum += cmn << ((whiteCol * n < left) ? 1 : 0);
                }
            }
            return sum;
        }

        int combination(int m, int n) {
            int res = 1;
            for (int p = n; p > m; p--) {
                res *= p;
            }
            for (int q = n - m; q > 0; q--) {
                res /= q;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int plan;
        plan = solution.paintingPlan(2, 1);
        System.out.println(plan);
    }
}
