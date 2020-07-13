package com.wenmq.algo.smart;

public class SmartSolution {

    public boolean canWinNim(int n) {
        return (n % 4) != 0;
    }

    public int[] numMovesStones(int a, int b, int c) {
        int cc = Math.max(a, Math.max(b, c));
        int aa = Math.min(a, Math.min(b, c));
        int bb = a ^ b ^ c ^ aa ^ cc;
        int d = (((bb - aa) > 2) && ((cc - bb) > 2) ? 2 : (cc - aa == 2) ? 0 : 1);
        int e = cc - aa - 2;
        return new int[]{d, e};
    }

    public double nthPersonGetsNthSeat(int n) {
        if (n > 1) return 0.5d;
        else return 1d;
    }

    public int getLastMoment(int n, int[] left, int[] right) {
        int ml = 0;
        int mr = 0;
        for (int i = 0; i < left.length; i++) {
            ml = Math.max(ml, left[i]);
        }
        for (int i = 0; i < right.length; i++) {
            mr = Math.max(mr, n - right[i]);
        }
        return Math.max(ml, mr);

    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public boolean canTransform(String start, String end) {
        int i = 0, j = 0;
        while (i < start.length() && j < end.length()){
            while (i < start.length() && start.charAt(i) == 'X'){
                i++;
            }
            while (j < end.length() && end.charAt(j) == 'X'){
                j++;
            }
            if (i < start.length() ^ j < end.length()){
                return false;
            }else if (i == start.length() && j == end.length()){
                return true;
            }else {
                if (start.charAt(i) != end.charAt(j) ||
                        (start.charAt(i) == 'L' && i < j) ||
                        (start.charAt(i) == 'R' && i > j)){
                    return false;
                }
            }
            i++;
            j++;
        }
        while (i < start.length() && start.charAt(i) == 'X'){
            i++;
        }
        while (j < end.length() && end.charAt(j) == 'X'){
            j++;
        }
        return i == start.length() && j == end.length();


    }
}