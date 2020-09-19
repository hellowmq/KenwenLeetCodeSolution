package com.wenmq.algo.math;

import java.util.Arrays;

public class MathSolution {
    private static MathSolution _instance;

//    public int countPrimes(int n) {
//
//
//
//    }

    public int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n / 5;
        }
        return sum;
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int nBit = n % 10;
            sum += nBit;
            mul *= nBit;
            n /= 10;
        }
        return mul - sum;
    }


    public static void main(String[] args) {
        System.out.println(getInstance().EggDrop(4,30));

    }


    public static MathSolution getInstance() {
        if (_instance == null) _instance = new MathSolution();
        return _instance;
    }


    void a() {
        System.out.println("MathSolution instance");
    }


    /**
     * @param K eggNun
     * @param N floorNum
     * @return
     *
     *
     *
     */

    // 2,1 1 1
    // 2,2 3 2,1
    // 2,3 6
    // 2,4 10
    // 2,5 15
    // 2,6 21
    // 2,7 28

    // 3,1 1 0 0 1
    // 3,2 3 2
    // 3,3 7 4
    // 3,4 14
    // 3,5 25
    // 3,6 41
    // 3,7

    // 4,1 1
    // 4,2 3
    // 4,3 7
    // 4,4 15
    // 4,5 30


    // k=2
    // [1]
    // [1,2],[3]
    // [1,2,3],[4,5],[6]

    // k=3 , 4
    // 8 [1-7] [9,14]
    // [1,2,3],[4,5],[6]
    // [7,8],[9]
    // [10]
    // [11,12],[13]
    // [14]

    // k=3 , 5
    // [1,2,3,4],[5,6,7],[8,9],[10]
    // [11,12,13],[14,15],[16]
    // [17,18],[19]
    // [20]



    public int superEggDrop(int K, int N) {
        return 0;
    }

    int EggDrop(int K, int N) {
        // dp[i][j]：一共有 i 层楼梯的情况下，使用 j 个鸡蛋的最少仍的次数
        int[][] dp = new int[N + 1][K + 1];

        // 初始化
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], i);
        }
        for (int j = 0; j <= K; j++) {
            dp[0][j] = 0;
        }

        dp[1][0] = 0;
        for (int j = 1; j <= K; j++) {
            dp[1][j] = 1;
        }
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
            dp[i][1] = i;
        }

        // 开始递推
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= K; j++) {
                // 在区间 [1, i] 里确定一个最优值
                int left = 1;
                int right = i;
                while (left < right) {
                    // 找 dp[k - 1][j - 1] <= dp[i - mid][j] 的最大值 k
                    int mid = left + (right - left + 1) / 2;

                    int breakCount = dp[mid - 1][j - 1];
                    int notBreakCount = dp[i - mid][j];
                    if (breakCount > notBreakCount) {
                        // 排除法（减治思想）写对二分见第 35 题，先想什么时候不是解
                        // 严格大于的时候一定不是解，此时 mid 一定不是解
                        // 下一轮搜索区间是 [left, mid - 1]
                        right = mid - 1;
                    } else {
                        // 这个区间一定是上一个区间的反面，即 [mid, right]
                        // 注意这个时候取中间数要上取整，int mid = left + (right - left + 1) / 2;
                        left = mid;
                    }
                }
                // left 这个下标就是最优的 k 值，把它代入转移方程 Math.max(dp[k - 1][j - 1], dp[i - k][j]) + 1) 即可
                dp[i][j] = Math.max(dp[left - 1][j - 1], dp[i - left][j]) + 1;
            }
        }

        return dp[N][K];
    }


}