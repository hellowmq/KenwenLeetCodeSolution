package com.wenmq.cn.leetcode;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * <a href="https://leetcode-cn.com/problems/print-in-order/">
 * Q114
 * </a>
 */
public class Solution1114 {
    /**
     * 三个线程
     * 一个将会调用 first() 方法
     * 一个将会调用 second() 方法
     * 还有一个将会调用 third() 方法
     * 尽管输入中的数字似乎暗示了顺序，但是我们并不保证线程在操作系统中的调度顺序。
     * 你看到的输入格式主要是为了确保测试的全面性。
     */
    static class Foo {

        private final AtomicBoolean mFirstLock = new AtomicBoolean();
        private final AtomicBoolean mSecondLock = new AtomicBoolean();

        public Foo() {
        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            mFirstLock.set(true);
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (!mFirstLock.get()) {
                ;
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            mSecondLock.set(true);
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (!mSecondLock.get()) {
                ;
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
