package com.example.madlibsswag;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FillActivity extends Activity {
 ArrayList<String> words;
 LinearLayout thislayout;

@SuppressLint("NewApi")
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	setContentView(R.layout.wordfiller_activity);
	super.onCreate(savedInstanceState);
	Intent intent = this.getIntent();
	String wordtype = "Verbs";
			
			//intent.getStringExtra("wordtype");
	
 thislayout = (LinearLayout)this.findViewById(R.id.layoutwordfiller);
	

	    this.displaywords(5, wordtype);
	
}

@SuppressLint("NewApi")
public void displaywords(int number, String wordtype){
	
	 

		LayoutParams lparams = new LayoutParams(
				   LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
	for(int i =0; i<=number; i++){
		TextView tv=new TextView(this);
		Log.i("works", "Swag");
		tv.setLayoutParams(lparams);
		tv.setText("wordtype");
		thislayout.addView(tv);
	
	
	}
}
	
	

}
