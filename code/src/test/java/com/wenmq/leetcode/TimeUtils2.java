package com.wenmq.leetcode;

public class TimeUtils2 {

    public static void post(Runnable runnable) {
        TimeCostCatcher timeCostCatcher = new TimeCostCatcher();
        timeCostCatcher.exeRun(runnable);
    }
    public static class TimeCostCatcher {

        void exeRun(Runnable runnable) {
            long startTime = System.currentTimeMillis();
            runnable.run();
            System.out.println(System.currentTimeMillis() - startTime);
        }
    }



}
