package com.sf._1rxjava;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sf.rxjava.R;

import rx.Observable;
import rx.functions.Action;
import rx.functions.Action1;
import rx.functions.Func1;

public class RxJavaActivity extends Activity {
    TextView _1RxJavaTv;
    Observable myObservable = Observable.just("Hello world").map(new Func1<String, String>() {
        @Override
        public String call(String o) {
            return o+"songfei";
        }
    });

    Action1 acton= new Action1() {
        @Override
        public void call(Object o) {
            _1RxJavaTv.setText((String)o);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1rxjava);
        _1RxJavaTv = (TextView) findViewById(R.id._1rxjava_tv);
        myObservable.subscribe(acton);
    }
}
