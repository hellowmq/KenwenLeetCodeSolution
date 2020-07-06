package com.wenmq.algo.bina;

/**
 * @author ifans.wen
 * @date 2020/7/6
 * @description
 */
public class BinarySolution {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
//                System.out.println(xorOperationLow1(i, j) + " " + xorOperation1(i, j));
                System.out.println(xorOperationLow2(i, j) + " " + xorOperation(i, j));
                int n = i;
                int start = j;
//                System.out.println(String.format("%s ^ %s  = %s", getXorResult(n + (start >> 1) - 1) << 1, getXorResult((start >> 1) - 1) << 1, xorOperation2(i, j - 1)));
            }

        }
    }

    static public int xorOperation1(int n, int start) {
        return (((getXorResult(n + start - 1))
                ^ (getXorResult(start - 1)))
//                + (start % 2)
        );
//        return (getXorResult(n + start >> 1) - getXorResult(start >> 1) + (start & 1));
    }

    static public int xorOperation(int n, int start) {
        int xorTop = getXorResult(n + (start >> 1) - 1);
        int xorBot = (getXorResult((start >> 1) - 1));
        return ((xorTop ^ xorBot) << 1 & (start & n & 1));
    }

    public static int getXorResult(int p) {
        if (p < 0) return 0;
        int a = p & 3;
        switch (a) {
            case 0:
                return p;
            case 1:
                return 1;
            case 2:
                return p + 1;
            case 3:
                return 0;
        }
        return 0;
    }

    public static int xorOperationLow1(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= (start + i);
        }
        return a;
    }

    public static int xorOperationLow2(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= (start + 2 * i);
        }
        return a;
    }



}
