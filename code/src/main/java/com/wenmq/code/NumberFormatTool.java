package com.wenmq.code;

import java.math.BigDecimal;

/**
 * @author ifans.wen
 * @date 2019/12/12
 * @description
 */
public class NumberFormatTool {
    public static String formatNumberWithWFloor(int number) {
        return formatNumberWithWFloor(number, 1);
    }


    public static String formatNumberWithWFloor(int number, int newScale) {
        if (number < 0) {
            return "0";
        } else if (number < 10000) {
            return String.valueOf(number);
        } else {
            return new BigDecimal(String.valueOf(((double) (number)) / 10000.0)).setScale(newScale, BigDecimal.ROUND_FLOOR).toPlainString() + "W";
        }
    }

    public static String formatNumberWithWHalfUp(int number, int newScale) {
        if (number < 0) {
            return "0";
        } else if (number < 10000) {
            return String.valueOf(number);
        } else {
            return new BigDecimal(String.valueOf(((double) (number)) / 10000.0))
                    .setScale(newScale, BigDecimal.ROUND_HALF_UP)
                    .stripTrailingZeros()
                    .toPlainString() + "W";
        }
    }

    public static String formatNumberWith999(int number) {
        if (number < 0) {
            return "0";
        } else if (number < 1000) {
            return String.valueOf(number);
        } else {
            return "999+";
        }
    }

    public static String formatNumberWith999(int number, boolean showNoneWhenZero) {
        if (number < 1) {
            return showNoneWhenZero ? "" : "0";
        } else if (number < 1000) {
            return String.valueOf(number);
        } else {
            return "999+";
        }
    }


    public static int parseIntFromString(String value) {
        int i = 0;
        try {
            i = Integer.parseInt(value);
        } catch (Exception e) {
            i = 0;
        }
        return i;
    }


}
