package com.wenmq.thread.production.inter;

public interface Model {
    Runnable newRunnableConsumer();

    Runnable newRunnableProducer();
}
