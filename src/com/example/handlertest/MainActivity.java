package com.example.handlertest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity  {
	private TextView tv;
	private Button button_start, button_stop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		button_start = (Button) findViewById(R.id.button_start);
		button_stop = (Button) findViewById(R.id.button_stop);
//		button_start.setOnClickListener(this);
//		button_stop.setOnClickListener(this);
	}

	public MainActivity getActivity(){
		return this;
	}
	
	
//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		
//	}

//	Handler handler = new Handler() {
//
//		@Override
//		public void handleMessage(Message msg) {
//			super.handleMessage(msg);
//		}
//
//	};
//
//	Runnable runnable = new Runnable() {
//
//		@Override
//		public void run() {
//			MainActivity.this.tv.append("\nhello");
//			handler.postDelayed(runnable, 1000);
//		}
//	};
//
//	@Override
//	public void onClick(View v) {
//		switch (v.getId()) {
//		case R.id.button_start:
//			handler.post(runnable);
//			break;
//		case R.id.button_stop:
//			handler.removeCallbacks(runnable);
//			break;
//		default:
//			break;
//		}
//	}
}
