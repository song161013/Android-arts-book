package com.sf._1rxjava;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sf.rxjava.R;

import rx.Observable;
import rx.Observer;


public class _1_RxJavaActivity extends Activity {
    TextView _1RxJavaTv;
Observable observable=Observable.just("song1","song2","song3");

    Observer observer = new Observer<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable throwable) {
        }
String s1="";
        @Override
        public void onNext(String s) {
            s1=s;
            _1RxJavaTv.setText(s);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1rxjava);
        _1RxJavaTv = (TextView) findViewById(R.id._1rxjava_tv);
        observable.subscribe(observer);
    }
}
