package com.coolweather.ui.activity;

import com.coolweather.service.DBController;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {
	
	public static final String TAG = "BaseActivity";

	protected DBController mDbController;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG , getClass().getSimpleName());
		
		mDbController = DBController.getInstance(getApplicationContext());

	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();

	}
	
}
