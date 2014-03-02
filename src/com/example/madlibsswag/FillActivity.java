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

	LinearLayout thislayout;
	Intent intent;
	int wordnumber;
	int wordtype;
	Libs mylib;
	boolean last = false;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		setContentView(R.layout.wordfiller_activity);
		super.onCreate(savedInstanceState);
		intent = this.getIntent();
		mylib = (Libs) intent.getSerializableExtra("lib");
		//words = new ArrayList<String>();
		thislayout = (LinearLayout)this.findViewById(R.id.layoutwordfiller);

		if(mylib.getNumbers(0)!=343){
			wordtype=0;
			Log.i("Worked", "first");
			wordnumber= mylib.getNumbers(wordtype);
			mylib.setNumbers(wordtype);
			this.displaywords(wordnumber, "Verbs");
		}
		else if(mylib.getNumbers(1)!=343){

			wordtype=1;
			Log.i("Worked", "second");
			wordnumber= mylib.getNumbers(wordtype);
			mylib.setNumbers(wordtype);
			
			this.displaywords(wordnumber, "Nouns");
		}
		else if(mylib.getNumbers(2)!=343){

			wordtype=2;
			Log.i("Worked", "third");
			wordnumber= mylib.getNumbers(wordtype);
			mylib.setNumbers(wordtype);
		last= true;
			this.displaywords(wordnumber, "Adj ");
		}
	



	}

	@SuppressLint("NewApi")
	public void displaywords(int number, String wordtype){



		LayoutParams lparams = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		for(int i =0; i<number; i++){
			EditText ed=new EditText(this);
			//Log.i("works", "Swag");
			ed.setLayoutParams(lparams);
			ed.setHint(wordtype);
			thislayout.addView(ed);


		}
	}

	public void nextc(View v){
		Log.i("worked", "Clicked");
		String[] array = new String[(wordnumber-1)];
		for(int i= 0; i>=wordnumber; i++){
			TextView textv=	(TextView) thislayout.getChildAt(i);



			array[(i-1)]=(textv.getText().toString());



		}
		mylib.setwords(array, wordtype);
		
	if(last==true){
//		Log.i("worked", "Last");
//		Intent intent = new Intent(getBaseContext(), MainActivity.class);
//		
//		startActivity(intent);
	}
	else{
		Intent intent = new Intent(getBaseContext(), FillActivity.class);
		intent.putExtra("lib", mylib);
		startActivity(intent);
	}

	}



}
