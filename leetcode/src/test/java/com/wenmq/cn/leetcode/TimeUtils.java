package com.wenmq.cn.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TimeUtils {
    private static Map<String, TimeUtils> sUtilsMap = new HashMap<>();

    private String mKey;
    private long mStartTime;

    private TimeUtils(String key) {
        this.mKey = key;
    }

    public static TimeUtils getInstance(String key) {
        if (sUtilsMap.containsKey(key)) {
            return sUtilsMap.get(key);
        } else {
            TimeUtils timeUtils = new TimeUtils(key);
            sUtilsMap.put(key, timeUtils);
            return timeUtils;
        }
    }


    public void start() {
        this.mStartTime = System.currentTimeMillis();
    }

    public void end() {
        System.out.println(mKey + ": " + spend());
        sUtilsMap.remove(this.mKey);
    }

    public long spend() {
        return System.currentTimeMillis() - mStartTime;
    }
}
