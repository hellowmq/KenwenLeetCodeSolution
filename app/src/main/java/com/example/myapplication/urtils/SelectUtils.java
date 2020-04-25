package com.example.myapplication.urtils;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnOptionsSelectChangeListener;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.bigkoo.pickerview.view.TimePickerView;
import com.example.myapplication.bean.BaseSelectData;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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


    public static void showTimeUltimateSelect(final Context context, final TimeSelectCallback callback) {
        Calendar selectedDate = Calendar.getInstance();
        Calendar startDate = Calendar.getInstance();
        //startDate.set(2013,1,1);
        Calendar endDate = Calendar.getInstance();
        //endDate.set(2020,1,1);

        //正确设置方式 原因：注意事项有说明
        startDate.set(2013, 0, 1);
        endDate.set(2020, 11, 31);
        TimePickerView pvTime = new TimePickerBuilder(context, new OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {//选中事件回调
                if (callback != null) {
                    callback.onSelectData(date);
                }
//                tvTime.setText(getTime(date));
            }
        })
                .setType(new boolean[]{true, true, true, false, false, false})// 默认全部显示
                .setCancelText("Cancel")//取消按钮文字
                .setSubmitText("Sure")//确认按钮文字
                .setContentTextSize(18)//滚轮文字大小
                .setTitleSize(20)//标题文字大小
                .setTitleText("Title")//标题文字
                .setOutSideCancelable(false)//点击屏幕，点在控件外部范围时，是否取消显示
                .isCyclic(true)//是否循环滚动
                .setTitleColor(Color.BLACK)//标题文字颜色
                .setSubmitColor(Color.BLUE)//确定按钮文字颜色
                .setCancelColor(Color.BLUE)//取消按钮文字颜色
                .setTitleBgColor(0xFF666666)//标题背景颜色 Night mode
                .setBgColor(0xFF333333)//滚轮背景颜色 Night mode
                .setDate(selectedDate)// 如果不设置的话，默认是系统时间*/
                .setRangDate(startDate, endDate)//起始终止年月日设定
                .setLabel("年", "月", "日", "时", "分", "秒")//默认设置为年月日时分秒
                .isCenterLabel(false) //是否只显示中间选中项的label文字，false则每项item全部都带有label。
                .isDialog(true)//是否显示为对话框样式
                .build();
        pvTime.show();
    }

    public static void showCommonSelect(final Context context, final List<BaseSelectData> options1Items, final List<List<BaseSelectData>> options2Items, final CommonMultiPickCallback callback) {

        final List<BaseSelectData> opList1 = options1Items;
        final List<List<BaseSelectData>> opList2 = options2Items;
        OptionsPickerView<BaseSelectData> pvOptions = new OptionsPickerBuilder(context, new OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3, View v) {
                //返回的分别是三个级别的选中位置
                if (callback != null) {
                    List<BaseSelectData> out4Callback = new ArrayList<>();
                    out4Callback.add(opList1.get(options1));
                    out4Callback.add(opList2.get(options1).get(2));
                    callback.onSelectData(out4Callback);
                }
            }
        }).setOptionsSelectChangeListener(new OnOptionsSelectChangeListener() {
            @Override
            public void onOptionsSelectChanged(int options1, int options2, int options3) {


            }
        })
                .setSubmitText("确定")//确定按钮文字
                .setCancelText("取消")//取消按钮文字
                .setTitleText("城市选择")//标题
                .setSubCalSize(18)//确定和取消文字大小
                .setTitleSize(20)//标题文字大小
//                .setTitleColor(Color.BLACK)//标题文字颜色
//                .setSubmitColor(Color.BLUE)//确定按钮文字颜色
//                .setCancelColor(Color.BLUE)//取消按钮文字颜色
//                .setTitleBgColor(0xFF333333)//标题背景颜色 Night mode
//                .setBgColor(0xFF000000)//滚轮背景颜色 Night mode
                .setContentTextSize(18)//滚轮文字大小
//                .isRestoreItem(false)//设置是否联动，默认true
                .setLabels("省", "市", "区")//设置选择的三级单位
                .isCenterLabel(false) //是否只显示中间选中项的label文字，false则每项item全部都带有label。
                .setCyclic(false, false, false)//循环与否
                .setSelectOptions(1, 1, 1)  //设置默认选中项
                .setOutSideCancelable(false)//点击外部dismiss default true
                .isDialog(true)//是否显示为对话框样式
                .isRestoreItem(true)//切换时是否还原，设置默认选中第一项。
                .build();

        pvOptions.setPicker(opList1, opList2, null);//添加数据源
        pvOptions.show();
    }

    public static void showCommonSelect(final Context context, final CommonMultiPickCallback callback) {
        final List<BaseSelectData> options1Items = getBaseSelectData();
        final List<List<BaseSelectData>> options2Items = getLists();
        showCommonSelect(context, options1Items, options2Items, callback);
    }


    private static List<List<BaseSelectData>> getLists() {
        final List<List<BaseSelectData>> options2Items = new ArrayList<>();
        ArrayList<BaseSelectData> options2Items_01 = new ArrayList<>();
        options2Items_01.add(new BaseSelectData("0", "广州"));
        options2Items_01.add(new BaseSelectData("1", "佛山"));
        options2Items_01.add(new BaseSelectData("2", "东莞"));
        options2Items_01.add(new BaseSelectData("3", "珠海"));
        ArrayList<BaseSelectData> options2Items_02 = new ArrayList<>();
        options2Items_02.add(new BaseSelectData("0", "长沙"));
        options2Items_02.add(new BaseSelectData("1", "岳阳"));
        options2Items_02.add(new BaseSelectData("2", "株洲"));
        options2Items_02.add(new BaseSelectData("3", "衡阳"));
        ArrayList<BaseSelectData> options2Items_03 = new ArrayList<>();
        options2Items_03.add(new BaseSelectData("0", "桂林"));
        options2Items_03.add(new BaseSelectData("1", "玉林"));
        options2Items.add(options2Items_01);
        options2Items.add(options2Items_02);
        options2Items.add(options2Items_03);
        return options2Items;
    }

    private static List<BaseSelectData> getBaseSelectData() {
        final List<BaseSelectData> options1Items = new ArrayList<>();
        //选项1
        options1Items.add(new BaseSelectData("0", "广东"));
        options1Items.add(new BaseSelectData("1", "湖南"));
        options1Items.add(new BaseSelectData("2", "广西"));
        return options1Items;
    }


    public interface TimeSelectCallback {
        void onSelectData(Date date);
    }


    public interface CommonPickCallback {
        void onSelectData(BaseSelectData selectData);
    }


    public interface CommonMultiPickCallback {
        void onSelectData(List<BaseSelectData> selectData);
    }


}





