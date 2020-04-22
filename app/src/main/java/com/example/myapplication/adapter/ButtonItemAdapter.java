package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.bean.DataType;

import java.util.List;

/**
 * @author ifans.wen
 * @date 2020/4/22
 * @description
 */
public class ButtonItemAdapter extends BaseAdapter {

    public ButtonItemAdapter(Context context, List<DataType> list) {
        mContext = context;
        mList = list;
    }

    private Context mContext;
    private List<DataType> mList;


    public void setList(List<DataType> list) {
        mList = list;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_button_list, null, false);
        TextView textView = inflate.findViewById(R.id.textView);
        textView.setText(mList.get(position).getTitle());
        return inflate;
    }
}
