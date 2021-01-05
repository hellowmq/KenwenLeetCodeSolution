package com.wenmq.tools;

import java.util.List;

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


    static public void printArray(Object[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        sb.append(']');
        System.out.println(sb);
    }

    public static String array2ListString(Object[] list) {
        StringBuilder sb = new StringBuilder();
        return appendArray(sb, list).toString();
    }

    public static StringBuilder appendArray(StringBuilder sb, Object[] list) {
        if (list == null) {
            return sb;
        }
        sb.append('[');
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (list[i] instanceof Object[]) {
                appendArray(sb, (Object[]) list[i]);
            } else {
                sb.append(list[i]);
            }
        }
        sb.append(']');
        return sb;
    }

}
