package com.wenmq.code;

/**
 * @author ifans.wen
 * @date 2020/3/16
 * @description
 */
public class HaNoi {

    static int number = 0;

    public static void solution(int n, char A, char B, char C) {
        System.out.println("" + number + "  " + n);
        if (n == 1) {
            moveFroTo(n, A, C);
        } else {
            solution(n - 1, A, C, B);
            moveFroTo(n, A, C);
            solution(n - 1, B, A, C);
        }
    }

    private static void moveFroTo(int n, char A, char C) {
        number++;
        System.out.println("Move sheet " + n + " from " + A + " to " + C);
    }


}
