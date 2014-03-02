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
		String story="There once was a noun1 with a adj1 noun2. He used his noun1 to verb1. His nextdoor neighbor didn't like it when he used his noun1 to verb2. Then he went into town to verb3. His neighbor was there so she verb4 his noun1 with her adj2 noun3. Her adj2 noun3 broke his adj1 noun1 in half! He was so sad he verb5 her adj3 noun3 with his noun4. His adj4 noun4 broke, but so did her adj5 noun3. She was sad so she got her noun5. Then they got married and they all lived happily ever after.";
		Libs lib = new Libs(new int[]{5,5,5},story );
		intent.putExtra("lib", lib);
		startActivity(intent);
		
		
	}


}
