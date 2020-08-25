package com.wenmq.thread.production.impl;

import com.wenmq.thread.production.inter.AbstractConsumer;
import com.wenmq.thread.production.inter.AbstractProducer;
import com.wenmq.thread.production.inter.Consumer;
import com.wenmq.thread.production.inter.Model;
import com.wenmq.thread.production.inter.Producer;
import com.wenmq.thread.production.inter.Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitNotifyModel implements Model {
    private final Object BUFFER_LOCK = new Object();
    private final Queue<Task> buffer = new LinkedList<>();
    private final int cap;
    private final AtomicInteger increTaskNo = new AtomicInteger(0);

    public WaitNotifyModel(int cap) {
        this.cap = cap;
    }

    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }

    @Override
    public Runnable newRunnableProducer() {
        return new ProduceImpl();
    }


    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {

        @Override
        public void consume() throws InterruptedException {
            synchronized (BUFFER_LOCK) {
                while (buffer.size() == 0) {
                    BUFFER_LOCK.wait();
                }
                Task task = buffer.poll();
                assert task != null;
                Thread.sleep(500 + (long) (Math.random() * 1000));
                System.out.println("consume: " + task.no);
                BUFFER_LOCK.notifyAll();
            }
        }
    }


    private class ProduceImpl extends AbstractProducer implements Producer, Runnable {

        @Override
        public void produce() throws InterruptedException {
            Thread.sleep((long) (Math.random() * 1000));
            synchronized (BUFFER_LOCK) {
                while (buffer.size() == cap) {
                    BUFFER_LOCK.wait();
                }
                Task task = new Task(increTaskNo.getAndIncrement());
                buffer.offer(task);
                System.out.println("produce :" + task.no);
                BUFFER_LOCK.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        Model model = new WaitNotifyModel(3);
        for (int i = 0; i < 3; i++) {
            new Thread(model.newRunnableConsumer()).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(model.newRunnableProducer()).start();
        }
    }


}
