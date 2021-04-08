package com.wenmq.cn.leetcode;

public class TimeUtils2 {

    public static boolean disableFlag = true;

    public static String sTag = "";

    public static void post(Runnable runnable) {
        if (disableFlag) {
            runnable.run();
            return;
        }
        TimeCostCatcher timeCostCatcher = new TimeCostCatcher();
        timeCostCatcher.exeRun(runnable);
    }

    public static class TimeCostCatcher {

        void exeRun(Runnable runnable) {
            long startTime = System.currentTimeMillis();
            runnable.run();
            System.out.println(sTag + (System.currentTimeMillis() - startTime));
        }
    }

}
