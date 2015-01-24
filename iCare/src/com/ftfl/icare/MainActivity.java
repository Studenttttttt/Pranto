package com.ftfl.icare;

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
	           
			  
				   
			
			public void Register(View v) {
				
				Intent i = new Intent(getApplicationContext(), Regestation.class);
				startActivity(i);
		
}
public void View(View v) {
				
				Intent i = new Intent(getApplicationContext(),ProfileView.class);
				startActivity(i);
		
}
}