package com.example.madlibsswag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ChooseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_activity);
	}
	
	public void game1c(View v){
		
		Intent intent = new Intent(getBaseContext(), FillActivity.class);
		intent.putExtra("wordtype", "Verbs");
		intent.putExtra("count", 5);
		startActivity(intent);
		
		
	}


}
