package com.wenmq.algo.design;

public class SingletonBestArray {
    /**
     * 线程安全
     * 双检查锁机制保证性能
     * 延迟初始化
     */
    public static class DoubleLockSingleton {
        public volatile static DoubleLockSingleton _instance;

        public DoubleLockSingleton() {
        }

        public static DoubleLockSingleton getInstance() {
            if (_instance == null) {
                synchronized (DoubleLockSingleton.class) {
                    if (_instance == null) {
                        _instance = new DoubleLockSingleton();
                    }
                }
            }
            return _instance;
        }
    }

    /**
     * 代码简洁
     * 延迟初始化
     * 线程安全（类初始化锁）
     */
    public static class InnerClassSingleton {
        public InnerClassSingleton() {
        }

        public static InnerClassSingleton getInstance() {
            return InnerClassSingletonHolder._instance;
        }

        public static class InnerClassSingletonHolder {

            public static final InnerClassSingleton _instance = new InnerClassSingleton();
        }
    }


    /**
     * 线程安全（类初始化锁）
     * 代码更加简洁
     */
    public enum EnumSingleton {
        INSTANCE;

        public void doSomething() {
            //todo doSomething
        }
    }

}
