package com.wenmq.cn.leetcode;

/**
 * Q67
 * https://leetcode-cn.com/problems/add-binary/
 */
public class Solution67 {

    /**
     * addBinary
     */
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                c += b.charAt(j--) - '0';
            }
            sb.append(c % 2);
            c >>= 1;
        }

        String res = sb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }


    /**
     * addBinary2
     */
    public String addBinary2(String a, String b) {
        char[] longChars;
        char[] shortChars;
        if (a.length() > b.length()) {
            longChars = a.toCharArray();
            shortChars = b.toCharArray();
        } else {
            shortChars = a.toCharArray();
            longChars = b.toCharArray();
        }
        int pre = 0;
        for (int is = shortChars.length - 1, il = is + (longChars.length - shortChars.length);
             is >= 0;
             is--, il--) {
            int s = shortChars[is] == '1' ? 1 : 0;
            int l = longChars[il] == '1' ? 1 : 0;
            int sum = pre + s + l;
            switch (sum) {
                case 0:
                    pre = 0;
                    longChars[il] = '0';
                    break;
                case 1:
                    pre = 0;
                    longChars[il] = '1';
                    break;
                case 2:
                    pre = 1;
                    longChars[il] = '0';
                    break;
                case 3:
                    pre = 1;
                    longChars[il] = '1';
                    break;
                default:
                    // ignore
            }
        }
        for (int il = longChars.length - shortChars.length - 1; il >= 0; il--) {
            int l = longChars[il] == '1' ? 1 : 0;
            int sum = pre + l;
            switch (sum) {
                case 0:
                    pre = 0;
                    longChars[il] = '0';
                    break;
                case 1:
                    pre = 0;
                    longChars[il] = '1';
                    break;
                case 2:
                    pre = 1;
                    longChars[il] = '0';
                    break;
                default:
                    // ignore
            }
        }
        if (pre == 1) {
            char[] result = new char[longChars.length + 1];
            result[0] = '1';
            System.arraycopy(longChars, 0, result, 1, longChars.length);
            return new String(result);
        } else {
            return new String(longChars);
        }
    }
}
