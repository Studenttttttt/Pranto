package com.ftfl.icare;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home  extends Activity{
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.home);


	  
	  
	  
	  Button profile = (Button) findViewById(R.id.button1);
	  
	  profile.setOnClickListener(new View.OnClickListener() {
	
           
		  
			   
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getApplicationContext(), MainActivity.class);
			startActivity(i);
		}
	  });
	  }
}
		
	
	 