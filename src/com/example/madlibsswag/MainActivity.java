package com.example.madlibsswag;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_main);
		Button myButton = (Button)this.findViewById(R.id.startgame);
		//swag
	}
	
	
	public void startclick(View v){
		Log.i("startbutton", "worked");
		Intent intent = new Intent(getBaseContext(), ChooseActivity.class);
		startActivity(intent);
		
		
	}
	//public boolean onOptionsItemSelected(MenuItem item);
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	//first madlib: There once was a noun1 with a adj1 noun2. He used his noun1 to verb1. His nextdoor neighbor didn't like it when he used his noun1 to verb2. Then he went into town to verb3. His neighbor was there so she verb4 his noun1 with her adj2 noun3. Her adj2 noun3 broke his adj1 noun1 in half! He was so sad he verb5 her adj3 noun3 with his noun4. His adj4 noun4 broke, but so did her adj5 noun3. She was sad so she got her noun5. Then they got married and they all lived happily ever after.
	}

}







