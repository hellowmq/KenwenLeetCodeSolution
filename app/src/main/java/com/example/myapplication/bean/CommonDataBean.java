package com.example.myapplication.bean;

import android.text.TextUtils;

/**
 * @author ifans.wen
 * @date 2020/4/22
 * @description
 */
public abstract class CommonDataBean implements DataType {
    String title;

    @Override
    public String getTitle() {
        return TextUtils.isEmpty(title) ? "" : title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
