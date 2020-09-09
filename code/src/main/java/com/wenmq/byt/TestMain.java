package com.wenmq.byt;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/9/9.
 */
public class TestMain {

    // javac ExceptionTest.java &&  javap -c ExceptionTest

    public static void main(String[] args) {
        final ExceptionTest exceptionTest = new ExceptionTest();
        final ExceptionTest exceptionTest2 = new ExceptionTest();
        exceptionTest.exceptionAllow = true;
//        System.out.println(exceptionTest.testStringException());
        System.out.println(exceptionTest.testException2());
        System.out.println(exceptionTest.testException3());
        System.out.println(exceptionTest.testException4());
        System.out.println(exceptionTest.testException5()[0]);
        System.out.println(exceptionTest.testException6());
        System.out.println("---------------");
//        System.out.println(exceptionTest2.testStringException());
        System.out.println(exceptionTest2.testException2());
        System.out.println(exceptionTest2.testException3());
        System.out.println(exceptionTest2.testException4());
        System.out.println(exceptionTest2.testException5()[0]);
        System.out.println(exceptionTest2.testException6());
    }
}
