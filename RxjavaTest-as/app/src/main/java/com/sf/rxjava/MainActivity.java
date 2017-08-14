package com.sf.rxjava;

import com.sf._1rxjava.RxJavaActivity;
import com.sf.rxjava.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button _1RxJava;
	Button _2RxJava;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		_1RxJava = (Button) findViewById(R.id._1rxjava_btn);
		_2RxJava = (Button) findViewById(R.id._2rxjava_btn);
		_2RxJava.setOnClickListener(this);
		_1RxJava.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id._1rxjava_btn: {
			Intent intent = new Intent(this, RxJavaActivity.class);
			startActivity(intent);
			break;
		}
		case R.id._2rxjava_btn: {
			Intent intent = new Intent(this, RxJavaActivity.class);
			startActivity(intent);
			break;
		}
		}
	}

}
