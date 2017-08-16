package com.sf._2okhttp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.sf.rxjava.R;
import com.sf.tools.HttpTool;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Finltop on 2017/8/16.
 */

public class _2_OkHttpActivity extends Activity {
    private TextView _2okhttpTv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2_okhttp);
        _2okhttpTv= (TextView) findViewById(R.id._2okhttp_tv);
        httpGet();
    }

    private void httpGet() {
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(HttpTool.getDoctorInfo)
                .build();
        Call call=okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Message msg=new Message();
                msg.obj=e.toString();
                mHadler.sendMessage(msg);
                mHadler.sendEmptyMessage(2);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String str=response.body().toString();
                Message msg=new Message();
                msg.obj=str;
                mHadler.sendMessage(msg);
            }
        });
    }
    private Handler mHadler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                {
                    String s= (String) msg.obj;
                    _2okhttpTv.setText(s);
                    break;
                }
                case 2:
                {
                    String s= (String) msg.obj;
                    _2okhttpTv.setText(s);
                    break;
                }
            }
        }
    };
}
