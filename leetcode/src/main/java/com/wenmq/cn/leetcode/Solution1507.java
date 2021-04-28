package com.wenmq.cn.leetcode;

/**
 * Q1507
 * https://leetcode-cn.com/problems/reformat-date/
 */
public class Solution1507 {
    /**
     * YYYY 表示 4 位的年份
     * MM 表示 2 位的月份
     * DD 表示 2 位的天数
     */
    public String reformatDate(String date) {
        int dateLen = date.length();
        StringBuilder sb = new StringBuilder(10);
        sb.append(date.substring(dateLen - 4));
        sb.append("-");
        String month = date.substring(dateLen - 8, dateLen - 5);
        appendMonth(sb, month);
        String day = date.substring(0, dateLen - 11);
        if (day.length() == 1) {
            sb.append("0");
        }
        sb.append(day);
        return sb.toString();
    }

    void appendMonth(StringBuilder sb, String month) {
        switch (month) {
            case "Jan":
                sb.append("01-");
                break;
            case "Feb":
                sb.append("02-");
                break;
            case "Mar":
                sb.append("03-");
                break;
            case "Apr":
                sb.append("04-");
                break;
            case "May":
                sb.append("05-");
                break;
            case "Jun":
                sb.append("06-");
                break;
            case "Jul":
                sb.append("07-");
                break;
            case "Aug":
                sb.append("08-");
                break;
            case "Sep":
                sb.append("09-");
                break;
            case "Oct":
                sb.append("10-");
                break;
            case "Nov":
                sb.append("11-");
                break;
            case "Dec":
                sb.append("12-");
                break;
            default:
                // ignore
        }
    }

}
