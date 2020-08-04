package com.wenmq.thread;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/7/29.
 */

class NumberPrint implements Runnable {
    public static int count = 15;
    public byte res[];
    private int number;

    public NumberPrint(int number, byte a[]) {
        this.number = number;
        res = a;
    }

    public void run() {
        synchronized (res) {
            while (count-- > 0) {
                try {
                    res.notify();//唤醒等待res资源的线程，把锁交给线程（该同步锁执行完毕自动释放锁）
                    System.out.println(" " + number);
                    Thread.sleep(2000);

                    res.wait();//释放CPU控制权，释放res的锁，本线程阻塞，等待被唤醒。
                    System.out.println("---" + res[0] + "---线程" + Thread.currentThread().getName() + "获得锁，wait()后的代码继续运行：" + number);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }//end of while
            return;
        }//synchronized

    }
}

