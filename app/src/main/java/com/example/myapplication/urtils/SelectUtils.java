package com.example.myapplication.urtils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.TimePickerView;

import java.util.Date;

/**
 * @author ifans.wen
 * @date 2020/4/22
 * @description
 */
public class SelectUtils {
    public static void showTimeSelect(final Context context, final TimeSelectCallback callback) {
        TimePickerView pvTime = new TimePickerBuilder(context, new OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                if (callback != null) {
                    callback.onSelectData(date);
                }
            }
        }).build();
        pvTime.show();
    }



    public static void showTimeSelect(final Context context, final TimeSelectCallback callback) {
        TimePickerView pvTime = new TimePickerBuilder(context, new OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                if (callback != null) {
                    callback.onSelectData(date);
                }
            }
        }).build();
        pvTime.show();
    }


    public interface TimeSelectCallback {
        void onSelectData(Date date);
    }
}





