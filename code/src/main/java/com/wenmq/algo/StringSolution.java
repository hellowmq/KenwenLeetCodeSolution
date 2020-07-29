package com.wenmq.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ifans.wen
 * @date 2020/7/15
 * @description
 *
 * test
 *
 */
public class StringSolution {

    private static StringSolution _instance;

    public static StringSolution getInstance() {
        if (_instance == null) _instance = new StringSolution();
        return _instance;
    }

    public static void main(String[] args) {
//        System.out.println(getInstance().titleToNumber("ZY"));
//        System.out.println(getInstance().convertToTitle(getInstance().titleToNumber("ZY")));
//        System.out.println(getInstance().reverseWords("  hello world!  "));
        System.out.println(getInstance().judgeCircle("LL"));
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


    public String reverseWords(String s) {
        String[] cs = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = cs.length - 1; i >= 0; i--) {
            if (cs[i].isEmpty()) continue;
            if (!" ".equals(cs[i])) {
                str.append(str.length() > 0 ? " " : "");
                str.append(cs[i]);
            }
        }
        return str.toString();
    }


    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        String res = s.substring(0, 1);
        // 中心位置枚举到 len - 2 即可
        for (int i = 0; i < len - 1; i++) {
            String oddStr = centerSpread(s, i, i);
            String evenStr = centerSpread(s, i, i + 1);
            String maxLenStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if (maxLenStr.length() > maxLen) {
                maxLen = maxLenStr.length();
                res = maxLenStr;
            }
        }
        return res;
    }

    private String centerSpread(String s, int left, int right) {
        // left = right 的时候，此时回文中心是一个字符，回文串的长度是奇数
        // right = left + 1 的时候，此时回文中心是一个空隙，回文串的长度是偶数
        int len = s.length();
        int i = left;
        int j = right;
        while (i >= 0 && j < len) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        // 这里要小心，跳出 while 循环时，恰好满足 s.charAt(i) != s.charAt(j)，因此不能取 i，不能取 j
        return s.substring(i + 1, j);
    }


    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        char[] strs = S.toCharArray();
        int a = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == '(') {
                a++;
                if (a == 1) {
                    continue;
                }
            }
            if (strs[i] == ')') {
                a--;
                if (a == 0) continue;
            }
            sb.append(strs[i]);
        }
        return sb.toString();
    }


    public int numJewelsInStones(String J, String S) {
        long a = 0;
        int sum = 0;
        for (int i = 0, len = J.length(); i < len; i++) {
            char j = J.charAt(i);
            a |= 1L << (j - 'A');
        }
        for (int i = 0, len = S.length(); i < len; i++) {
            char j = S.charAt(i);
            if ((a & (1L << (j - 'A'))) != 0) sum++;
        }
        return sum;
    }


    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");

    }


    public boolean judgeCircle(String moves) {
        return moves.split("U").length == moves.split("D").length &&
         moves.split("L").length == moves.split("R").length;

    }
}
