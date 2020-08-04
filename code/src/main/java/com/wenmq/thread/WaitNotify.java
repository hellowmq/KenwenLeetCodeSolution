package com.wenmq.thread;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/7/29.
 */

public class WaitNotify {
    public static void main(String args[]) {
        final byte a[] = {0};//以该对象为共享资源
        new Thread(new NumberPrint((2), a), "thread2").start();
        new Thread(new NumberPrint((1), a), "thread1").start();
    }
}
