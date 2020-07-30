package com.wenmq.algo.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 集合了各种单例模式的写法
 */
public class SingletonArray {
    /**
     * 非线程安全
     */
    public static class Singleton1 {

        public Singleton1() {
        }

        private static Singleton1 _instance;

        public static Singleton1 getInstance() {
            if (_instance == null) {
                _instance = new Singleton1();
            }
            return _instance;
        }
    }

    /**
     * 线程安全：给线程加锁
     */
    public static class Singleton2 {
        public Singleton2() {
        }

        private static Singleton2 _instance;

        public synchronized static Singleton2 getInstance() {
            if (null == _instance) {
                _instance = new Singleton2();
            }
            return _instance;
        }
    }


    /**
     * 线程安全双重检查锁（同步代码块）
     */
    public static class Singleton3 {
        public Singleton3() {
        }

        private static Singleton3 _instance;

        public static Singleton3 getInstance() {
            if (null == _instance) {
                synchronized (Singleton3.class) {
                    if (null == _instance) {
                        _instance = new Singleton3();
                    }
                }
            }
            return _instance;
        }
    }


    /**
     *
     */
    public static class Singleton4 {

        private
        static class SingletonHolder {
            private static final Singleton4 _instance = new Singleton4();
        }

        public static Singleton4 getInstance() {
            return SingletonHolder._instance;
        }

        public Singleton4() {
        }
    }


    /**
     * 线程安全：枚举
     * 《Effective Java》提倡
     */
    enum Singleton5 {
        INSTANCE;
    }


    /**
     * ThreadLocal 会为每一个线程提供独立的副本，从空间上解决访问冲突
     */
    public static class Singleton6 {
        private static final ThreadLocal<Singleton6> tlSingleton = new ThreadLocal<Singleton6>() {
            @Override
            protected Singleton6 initialValue() {
                return new Singleton6();
            }
        };

        public static Singleton6 getInstance() {
            return tlSingleton.get();
        }

        private Singleton6() {

        }
    }


    /**
     * 线程安全：CAS 锁
     */
    public static class Singleton7 {
        public static final AtomicReference<Singleton7> _instance = new AtomicReference<>();

        public static Singleton7 getInstance() {
            while (true) {
                Singleton7 cur = _instance.get();
                if (cur != null) {
                    return cur;
                }
                cur = new Singleton7();
                if (_instance.compareAndSet(null, cur)) {
                    return cur;
                }
            }
        }

        public Singleton7() {
        }
    }

}
