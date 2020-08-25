package com.wenmq.code;


public class VolatileTest {

    private int a = 0;
    private static int countZero = 0;
    private static int countOne = 0;
    private static volatile boolean condition = true;

    private int getA() {
        return a;
    }

    private void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread3 = new Thread(() -> {
            while (condition) {
                try {
                    Thread.sleep(100);
                    System.out.println(countOne);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread3.start();
        for (int i = 0; i < 100000; i++) {
            VolatileTest volatileTest = new VolatileTest();
            Thread thread1 = new Thread(() -> {
                volatileTest.setA(10);
            });

            Thread thread2 = new Thread(() -> {
                thread1.start();
                int a = volatileTest.getA();
                if (a == 0) {
                    countOne++;
                }
            });
            thread2.start();
        }
        condition = false;
    }
}
