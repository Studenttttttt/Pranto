package com.ftfl.icare;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Regestation extends Activity {	
	   TextView name ;
	   TextView fName;
	   TextView mName;
	   TextView dob;
	   TextView gender;
	   TextView height;
	   TextView weight;
	   public static final String MyPREFERENCES = "MyPrefs" ;
	   public static final String Name = "nameKey"; 
	   public static final String Fname = "fNameKey"; 
	   public static final String Mname = "mNameKey"; 
	   public static final String Dob = "dobKey"; 
	   public static final String Gender = "genderKey"; 
	   public static final String Height = "heightKey"; 
	   public static final String Weight = "weightKey"; 
	   Button update_btn, delete_btn;
	
	
	   SharedPreferences sharedpreferences;

	
	
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.profile);
	        
	        
	       
	        name = (TextView) findViewById(R.id.name);
		    fName = (TextView) findViewById(R.id.fathers_name);
		    mName = (TextView) findViewById(R.id.mothers_name);
		    dob = (TextView) findViewById(R.id.date_of_birth);
		    gender = (TextView) findViewById(R.id.gender);
		    height = (TextView) findViewById(R.id.height);
		    weight= (TextView) findViewById(R.id.weight);
			
		    sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


		      if (sharedpreferences.contains(Name))
		      {
		         name.setText(sharedpreferences.getString(Name,"" ));

		      }
		      if (sharedpreferences.contains(Fname))
		      {
		         fName.setText(sharedpreferences.getString(Fname, ""));

		      }
		      if (sharedpreferences.contains(Mname))
		      {
		         mName.setText(sharedpreferences.getString(Mname, ""));

		      }
		      if (sharedpreferences.contains(Dob))
		      {
		         dob.setText(sharedpreferences.getString(Dob, ""));

		      }
		      if (sharedpreferences.contains(Gender))
		      {
		        gender.setText(sharedpreferences.getString(Gender,""));

		      }
		      if (sharedpreferences.contains(Height))
		      {
		        height.setText(sharedpreferences.getString(Height,""));

		      }
		      if (sharedpreferences.contains(Weight))
		      {
		      weight.setText(sharedpreferences.getString(Weight,""));
	
              }
}
	 public void Save(View v){
	      String n  = name.getText().toString();
	      String fn  = fName.getText().toString();
	      String mn  = mName.getText().toString();
	      String d  =dob.getText().toString();
	      String g  = gender.getText().toString();
	      String h  =height.getText().toString();
	      String w  = weight.getText().toString();
	      
	      Editor editor = sharedpreferences.edit();
	      editor.putString(Name, n);
	      editor.putString(Fname, fn);
	      editor.putString(Mname, mn);
	      editor.putString(Dob, d);
	      editor.putString(Gender, g);
	      editor.putString(Height, h);
	      editor.putString(Weight, w);

	      editor.commit(); 
	      finish();
	 }

}