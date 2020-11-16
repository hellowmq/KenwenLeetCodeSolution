package com.wenmq.tools;

public class ArrayTools {
    static public void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        sb.append(']');
        System.out.println(sb);
    }

    static public void print2DArray(int[][] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i != 0) sb.append(',');
            sb.append('[');
            for (int j = 0; j < a[i].length; j++) {
                if (j != 0) sb.append(',');
                sb.append(a[i][j]);
            }
            sb.append(']');
        }
        sb.append(']');
        System.out.println(sb);
    }
}
