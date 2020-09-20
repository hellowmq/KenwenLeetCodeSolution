package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.adapter.ButtonItemAdapter;
import com.example.myapplication.bean.BaseSelectData;
import com.example.myapplication.bean.CommonTitleBean;
import com.example.myapplication.bean.DataType;
import com.example.myapplication.urtils.SelectUtils;
//import com.wenmq.anno.GetMsg;
//import com.wenmq.clickanno.OnceClick;
//import com.wenmq.clickapi.OnceInit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


//@GetMsg(id = 2, name = "MAIN")
public class MainActivity extends AppCompatActivity {



    private ListView mListView;
    private List<DataType> mList;
    private ButtonItemAdapter mButtonItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBaseView();
    }


    View mContainer;

    private void initBaseView() {
        mContainer = findViewById(R.id.content);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(this);
        mListView = findViewById(R.id.listView);
        generateDataList(100);
        mButtonItemAdapter = new ButtonItemAdapter(this, mList);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                clickByPosition(position);
            }
        });

        mListView.setAdapter(mButtonItemAdapter);

    }

    private void clickByPosition(final int position) {
        requestByUrl("https:www.baidu.com");


//        if (position < 10) {
//            SelectUtils.showTimeUltimateSelect(MainActivity.this
//                    , new SelectUtils.TimeSelectCallback() {
//                        @Override
//                        public void onSelectData(Date date) {
//                            Toast.makeText(MainActivity.this, (date).toString(), Toast.LENGTH_SHORT).show();
//                            mList.get(position).setTitle(date.toString());
//                            if (mButtonItemAdapter != null) {
//                                mButtonItemAdapter.notifyDataSetChanged();
//                            }
//                        }
//                    });
//        } else if (position < 20) {
//            SelectUtils.showCommonSelect(MainActivity.this, new SelectUtils.CommonMultiPickCallback() {
//                @Override
//                public void onSelectData(List<BaseSelectData> selectData) {
//                    String tx = selectData.get(0).getPickerViewText()
//                            + selectData.get(1).getPickerViewText();
////                        + options3Items.get(options1).get(option2).get(options3).getPickerViewText();
//                }
//            });
//
//        } else {
//            SelectUtils.showTimeSelect(MainActivity.this
//                    , new SelectUtils.TimeSelectCallback() {
//                        @Override
//                        public void onSelectData(Date date) {
//                            Toast.makeText(MainActivity.this, (date).toString(), Toast.LENGTH_SHORT).show();
//                            mList.get(position).setTitle(date.toString());
//                            if (mButtonItemAdapter != null) {
//                                mButtonItemAdapter.notifyDataSetChanged();
//                            }
//                        }
//                    });
//        }

//        OnceInit.once(this, 2000);
    }

    private void requestByUrl(String url) {
        OkHttpClient client = new OkHttpClient();

        Log.e(MainActivity.class.getSimpleName(), "start");
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        Call call = client.newCall(request);
        //异步调用,并设置回调函数
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                Log.e(MainActivity.class.getSimpleName(), "onFailed" );
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, "get failed", Toast.LENGTH_SHORT).show();

                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                Log.e(MainActivity.class.getSimpleName(), "succes");
                final String res = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.e(MainActivity.class.getSimpleName(), res);
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


//    @Override
//    public void onClick(View v) {
//        int id = v.getId();
//        switch (id) {
//            case R.id.fab:
//                selectTime();
//
//                break;
//
//        }
//    }


//    @OnceClick(value = R.id.fab)
    private void selectFab() {
        SelectUtils.showCommonSelect(MainActivity.this, new SelectUtils.CommonMultiPickCallback() {
            @Override
            public void onSelectData(List<BaseSelectData> selectData) {
                Toast.makeText(MainActivity.this, (selectData).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }


    void generateDataList(int length) {
        if (mList == null) mList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            final String s = String.valueOf(i);
            mList.add(new CommonTitleBean(s));
        }
    }


}
