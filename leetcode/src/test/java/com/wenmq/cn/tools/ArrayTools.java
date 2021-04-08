package com.wenmq.cn.tools;

import java.util.Arrays;

public class ArrayTools {
    public static void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a[i]);
        }
        sb.append(']');
        System.out.println(sb);
    }

    public static void printArray(Object[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a[i]);
        }
        sb.append(']');
        System.out.println(sb);
    }

    public static void print2DArray(int[][] a) {
        System.out.println(get2DIntString(a));
    }

    public static String get2DIntString(int[][] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append('[');
            for (int j = 0; j < a[i].length; j++) {
                if (j != 0) {
                    sb.append(',');
                }
                sb.append(a[i][j]);
            }
            sb.append(']');
        }
        sb.append(']');
        return sb.toString();
    }

    public static String array2ListString(Object[] list) {
        StringBuilder sb = new StringBuilder();
        return appendArray(sb, list).toString();
    }

    /**
     * appendArray
     */
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
            } else if (list[i] instanceof int[]) {
                appendArray(sb, (int[]) list[i]);
            } else {
                sb.append(list[i]);
            }
        }
        sb.append(']');
        return sb;
    }

    public static StringBuilder appendArray(StringBuilder sb, int[] list) {
        if (list == null) {
            return sb;
        }
        sb.append('[');
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(list[i]);
        }
        sb.append(']');
        return sb;

    }


    public static Object copyOf(Object array) {
        if (array instanceof int[][][]) {
            return copyOfTriple((int[][][]) array);
        }
        if (array instanceof int[][]) {
            return copyOfMatrix((int[][]) array);
        }
        if (array instanceof int[]) {
            return copyOfArray((int[]) array);
        }
        return null;
    }

    public static int[] copyOfArray(int[] array) {
        if (array == null) {
            return null;
        }
        return Arrays.copyOf(array, array.length);
    }

    public static int[][] copyOfMatrix(int[][] array) {
        if (array == null) {
            return null;
        }
        int[][] matrix = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            matrix[i] = copyOfArray(array[i]);
        }
        return matrix;
    }

    public static int[][][] copyOfTriple(int[][][] array) {
        if (array == null) {
            return null;
        }
        int[][][] matrix = new int[array.length][][];
        for (int i = 0; i < array.length; i++) {
            matrix[i] = copyOfMatrix(array[i]);
        }
        return matrix;
    }


}
