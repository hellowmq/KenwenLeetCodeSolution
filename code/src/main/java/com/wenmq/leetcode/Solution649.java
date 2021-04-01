package com.wenmq.leetcode;

import java.util.LinkedList;

/**
 * Q649
 * https://leetcode-cn.com/problems/dota2-senate/
 */
public class Solution649 {
    /**
     * 方法一：
     */
    public String predictPartyVictory(String senate) {

        LinkedList<Boolean> list = new LinkedList<>();
        char[] chars = senate.toCharArray();
        int rCount = 0;
        for (char aChar : chars) {
            boolean e = aChar == 'R';
            list.offer(e);
            if (e) {
                rCount++;
            }
        }
        int bias = 0;
        int dCount = chars.length - rCount;
        while ((((rCount + bias) > 0)
                && ((dCount - bias) > 0))) {
            Boolean poll = list.pop();
            if (((bias < 0 && poll)
                    || (bias > 0 && !poll))) {
                bias += poll ? 1 : -1;
                if (poll) {
                    rCount--;

                } else {
                    dCount--;
                }
                continue;
            }
            list.offer(poll);
            bias += poll ? 1 : -1;
        }
        return list.getLast() ? "Radiant" : "Dire";
    }

    /**
     * 方法二：
     */
    public String predictPartyVictory2(String senate) {

        char[] chars = senate.toCharArray();
        int rCount = 0;
        for (char aChar : chars) {
            if (aChar == 'R') {
                rCount++;
            }
        }
        int slow = 0;
        int fast = chars.length;
        int bias = 0;
        int dCount = chars.length - rCount;
        while (!(rCount + bias <= 0 || (dCount - bias) <= 0)) {
            char pol = chars[slow % chars.length];
            boolean poll = pol == 'R';
            if (((bias < 0 && poll) || (bias > 0 && !poll))) {
                bias += poll ? 1 : -1;
                if (poll) {
                    rCount--;
                } else {
                    dCount--;
                }
                slow++;
            } else {
                chars[fast % chars.length] = pol;
                bias += poll ? 1 : -1;
                slow++;
                fast++;
            }
        }
        return chars[(fast - 1) % chars.length] == 'R' ? "Radiant" : "Dire";

    }

    /**
     * predictPartyVictory3
     */
    public String predictPartyVictory3(String senate) {
        char[] chars = senate.toCharArray();
        boolean[] booleans = new boolean[chars.length << 1];

        int rCount = 0;
        for (int i = 0; i < chars.length; i++) {
            booleans[i] = chars[i] == 'R';
            if (chars[i] == 'R') {
                rCount++;
            }
        }
        int slow = 0;
        int fast = chars.length;
        int bias = 0;
        int dCount = chars.length - rCount;
        for (int i = 0; i < booleans.length; i++) {
            if (rCount + bias <= 0 || (dCount - bias) <= 0) {
                break;
            }
            boolean poll = booleans[slow];
            if (((bias < 0 && poll) || (bias > 0 && !poll))) {
                bias += poll ? 1 : -1;
                if (poll) {
                    rCount--;
                } else {
                    dCount--;
                }
                slow++;
                continue;
            }
            booleans[fast] = poll;
            bias += poll ? 1 : -1;
            slow++;
            fast++;


        }
        return booleans[fast - 1] ? "Radiant" : "Dire";
    }


    /**
     * 方法4：
     */
    public String predictPartyVictory4(String senate) {

        char[] chars = senate.toCharArray();

        int slow = 0;
        int fast = chars.length;
        int bias = 0;
        while (fast - slow > Math.abs(bias)) {
            char pol = chars[slow % chars.length];
            boolean poll = pol == 'R';
            if (((bias < 0 && poll) || (bias > 0 && !poll))) {
                bias += poll ? 1 : -1;
                slow++;
            } else {
                chars[fast % chars.length] = pol;
                bias += poll ? 1 : -1;
                slow++;
                fast++;
            }
        }
        return bias > 0 ? "Radiant" : "Dire";

    }
}
