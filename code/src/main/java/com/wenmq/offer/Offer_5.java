package com.wenmq.offer;

/**
 *
 * Offer-5
 * 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Offer_5 {


    /**
     * 这道题主要是针对 C/C++ 开发者，C++ 应当从尾部移动字符。
     */
    class Solution1 implements Solution {

        @Override
        public String replaceSpace(String s) {
            int length = s.length();
            char[] array = new char[length * 3];
            int size = 0;
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    array[size++] = '%';
                    array[size++] = '2';
                    array[size++] = '0';
                } else {
                    array[size++] = c;
                }
            }
            return new String(array, 0, size);
        }
    }

    interface Solution {
        public String replaceSpace(String s);
    }
}
