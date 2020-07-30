package com.wenmq.algo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetSolution {

    private static SetSolution _instance;

    public static void main(String[] args) {
//        getInstance().twoSum(new int[]{2, 7, 11, 15}, 9);
//        getInstance().isRectangleOverlap(
//                new int[]{0, 0, 2, 2},
//                new int[]{1, 1, 3, 3}
//        );
//        for (int i = 0; i < 37; i++) {
//            System.out.println(i + " " + getInstance().arrangeCoins(i));
//        }
        System.out.println(getInstance().arrangeCoins(1804289383));
    }

    public static SetSolution getInstance() {
        if (_instance == null) _instance = new SetSolution();
        return _instance;
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> set = new HashMap<>();
        int upper = target - numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > upper) break;
            ;
            if (set.containsKey(numbers[i])) {
                return new int[]{set.get(numbers[i]) + 1, i + 1};
            } else {
                set.put(target - numbers[i], i);
            }
        }
        return new int[]{};
    }


    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0] || rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
    }

    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }


}
