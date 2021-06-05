package com.wenmq.cn.leetcode;

/**
 * Q1360
 * https://leetcode-cn.com/problems/number-of-days-between-two-dates/
 */
public class Solution1360 {
    /**
     * Zeller Day
     */
    public int daysBetweenDates(String date1, String date2) {
        int day1 = toDay(date1);
        int day2 = toDay(date2);
        return Math.abs(day1 - day2);
    }

    public static int toDay(String dateStr) {
        String[] temp = dateStr.split("-");
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);

        if (month <= 2) {
            year--;
            month += 10;
        } else {
            month -= 2;
        }
        return 365 * year + year / 4 - year / 100 + year / 400 + 30 * month + (3 * month - 1) / 5 + day - 584418;
    }
}
