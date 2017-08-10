package com.ryg.chapter_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
	if (v.getId() == R.id.button1) {// View基础
	    Intent intent = new Intent(this, TestActivity.class);
	    startActivity(intent);
	} else if (v.getId() == R.id.button2) {// 滑动冲突场景1-外部拦截
	    Intent intent = new Intent(this, DemoActivity_1.class);
	    startActivity(intent);
	} else if (v.getId() == R.id.button3) {// 滑动冲突场景1-内部拦截
	    Intent intent = new Intent(this, DemoActivity_2.class);
	    startActivity(intent);
	}
    }
}
