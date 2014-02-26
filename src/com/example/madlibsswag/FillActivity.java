package com.example.madlibsswag;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FillActivity extends Activity {
	ArrayList<String> words;
	LinearLayout thislayout;
	Intent intent;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.wordfiller_activity);
		super.onCreate(savedInstanceState);
		intent = this.getIntent();
		String wordtype = intent.getStringExtra("wordtype");

		thislayout = (LinearLayout)this.findViewById(R.id.layoutwordfiller);


		this.displaywords(intent.getIntExtra("count", 5), wordtype);

	}

	@SuppressLint("NewApi")
	public void displaywords(int number, String wordtype){



		LayoutParams lparams = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		for(int i =0; i<=number; i++){
			EditText ed=new EditText(this);
			Log.i("works", "Swag");
			ed.setLayoutParams(lparams);
			ed.setHint("wordtype");
			thislayout.addView(ed);


		}
	}

	public void nextc(View v){

		int number = intent.getIntExtra("count",5);
		for(int i= 0; i>=number; i++){
		TextView textv=	(TextView) thislayout.getChildAt(i);
		
		//
		
		}

	}



}
