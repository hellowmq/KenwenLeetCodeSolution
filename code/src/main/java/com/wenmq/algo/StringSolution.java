package com.wenmq.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ifans.wen
 * @date 2020/7/15
 * @description
 */
public class StringSolution {

    private static StringSolution _instance;

    public static StringSolution getInstance() {
        if (_instance == null) _instance = new StringSolution();
        return _instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().titleToNumber("ZY"));
        System.out.println(getInstance().convertToTitle(getInstance().titleToNumber("ZY")));
    }


    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1.length == 0 ? 0 : s1[s1.length - 1].length();
    }

    public String addBinary(String a, String b) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            carry += i >= 0 ? a.charAt(i--) - '0' : 0;
            carry += j >= 0 ? b.charAt(j--) - '0' : 0;
            stack.push(carry % 2);
            carry = carry / 2;
        }
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.toString();

    }


    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char as = s.charAt(i);
            sum = sum * 26 + (as & 0x3F);
        }
        return sum;
    }

    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            n--;
            s.append((char) ('A' + (n % 26)));
            n /= 26;
        }
        s.reverse();
        return s.toString();
    }
}
