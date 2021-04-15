package com.wenmq.cn.leetcode;

/**
 * Q1694
 * https://leetcode-cn.com/problemset/all/
 */
public class Solution1694 {
    /**
     * 计算新数组的长度
     * 每三个数字插入一个 '-'
     * 如果末尾不符合规则，调整
     */
    public String reformatNumber(String number) {
        char[] chars = number.toCharArray();
        int length = 0;
        for (char c : chars) {
            if (c > '-') {
                length++;
            }
        }
        int len = length + length / 3 + (length % 3 == 0 ? -1 : 0);
        char[] newChars = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if ((i & 3) == 3) {
                newChars[i] = '-';
                continue;
            }
            while (chars[index] < '0') {
                index++;
            }
            newChars[i] = chars[index++];
        }
        if (newChars[len - 2] == '-') {
            newChars[len - 2] = newChars[len - 3];
            newChars[len - 3] = '-';
        }
        return new String(newChars);

    }


    /**
     * 直接用 replace 得到纯数字字符串
     * 每三个数字插入一个 '-'
     * 如果末尾不符合规则，调整
     */
    public String reformatNumber2(String number) {
        String rawNumber = number
                .replace(" ", "")
                .replace("-", "");
        int length = rawNumber.length();
        int len = length + length / 3;
        if (length % 3 == 0) {
            len--;
        }
        char[] newChars = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if ((i & 3) == 3) {
                newChars[i] = '-';
                continue;
            }
            newChars[i] = rawNumber.charAt(index++);
        }
        if (newChars[len - 2] == '-') {
            newChars[len - 2] = newChars[len - 3];
            newChars[len - 3] = '-';
        }
        return new String(newChars);

    }

}
