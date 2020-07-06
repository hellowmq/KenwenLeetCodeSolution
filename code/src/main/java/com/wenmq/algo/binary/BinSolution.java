package com.wenmq.algo.binary;

import java.text.DecimalFormat;

public class BinSolution {

    static String dec2bin(int a) {
        return Integer.toBinaryString(a);
    }


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int j = 1; j < 17; j++) {
            int start = 5;
            int i1 = xorOperationLow(j, start);
            sb.append(getFormat(i1)).append(' ');
        }
        System.out.println(sb);
        sb = new StringBuffer();
        for (int j = 1; j < 17; j++) {
            int start = 5;
            int i2 = xorOperation(j, start);
            sb.append(getFormat(i2)).append(' ');
        }
        System.out.println(sb);
//            System.out.println("i2 " + i + " " + i2 + " " + dec2bin(i2));
    }

    private static String getFormat(int i1) {
        return new DecimalFormat("00").format(i1);
    }

    static public int xorOperation(int n, int start) {
        int mode = n % 4;
        switch (mode) {
            case 0:
                return (start + 2 * n) ^ start ^ 2;
            case 1:
                return start;
            case 2:
                return (start + 2 * n) ^ start;
            case 3:
                return start ^ 2;
        }
        return 0;
    }

    static public int xorOperationLow(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= (start + 2 * i);
        }
        return a;
    }




}
