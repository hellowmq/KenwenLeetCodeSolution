package com.wenmq.algo.math;

public class MathSolution {

//    public int countPrimes(int n) {
//
//
//
//    }

    public int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n / 5;
        }
        return sum;
    }
}