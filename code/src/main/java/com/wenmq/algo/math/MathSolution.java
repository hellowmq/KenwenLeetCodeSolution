package com.wenmq.algo.math;

public class MathSolution {
    private static MathSolution _instance;

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

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int nBit = n % 10;
            sum += nBit;
            mul *= nBit;
            n /= 10;
        }
        return mul - sum;
    }


    public static void main(String[] args) {
        System.out.println(getInstance().subtractProductAndSum(4421));

    }



    public static MathSolution getInstance() {
        if (_instance == null) _instance = new MathSolution();
        return _instance;
    }


}