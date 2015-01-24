package com.ftfl.icare;



import com.google.gson.Gson;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class DietActivity extends Activity {
	
	 private static final String MyPREFERENCES = "MyPrefs";
	 private static final String PREF = "profiles";
	 private Spinner dietNameSprinner;
	 private  ArrayAdapter<CharSequence> adapter;
	 private EditText menuDescriptionEditText;
	 private TimePicker time;
	 private Button cteateDiet;
	 private Gson json;
	 private SharedPreferences sharedPref;
	 private Profile profileObject;
	 private int profileId=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_icare_create_diet);
		
		sharedPref= getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		
	
	
		initialize();
		setSpinner();
		json= new Gson();
		String getProfile = sharedPref.getString(PREF, "");
		profileObject  = json.fromJson(getProfile, Profile.class);
		//profileId=profileObject.getId();
		//Toast.makeText(this,profileId, Toast.LENGTH_SHORT).show();
		
		
       
    
        
	}
	
	public void createDiet(View view){
		String dietName=dietNameSprinner.getSelectedItem().toString();
		String dietTime=time.getCurrentHour() +":"+time.getCurrentMinute();
		String dietMenu=menuDescriptionEditText.getText().toString();	
		DietModel diet=new DietModel(dietName,dietTime,dietMenu);
		diet.setProfileId(profileId);
		DietTableHelper helper=new DietTableHelper(this);
		Toast.makeText(this, String.valueOf(helper.createDiet(diet, profileId)), Toast.LENGTH_SHORT).show();
		
		Intent i = new Intent(getApplicationContext(), DietList.class);
		startActivity(i);

		
	}
	public void initialize(){
		
		dietNameSprinner = (Spinner) findViewById(R.id.dietName);
		menuDescriptionEditText=(EditText)findViewById(R.id.menuEditText);
		time=(TimePicker)findViewById(R.id.time);
		cteateDiet=(Button)findViewById(R.id.CreateDiet);
	}
	
	public void setSpinner(){
		
		        adapter = ArrayAdapter.createFromResource(this,
		        R.array.dietNameSpinner, android.R.layout.simple_spinner_item);
		        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		        dietNameSprinner.setAdapter(adapter);
	}
	

}
