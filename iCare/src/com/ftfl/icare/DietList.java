package com.ftfl.icare;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class DietList extends ListActivity {
	DietTableHelper mydb;
	private BaseBundle dietNames;
	private ArrayList<String> names;
	private ArrayList<String> times;
	private ArrayList<String> menus;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		/* String[] values = new String[] { "a", "b", "c", "d", "e", "f", "g",
			        "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			        "t", "u", "w", "x", "y", "z" };*/
		 mydb = new DietTableHelper(this);
		 ArrayList<DietModel> array_list = mydb.getDietList(1);
		 names= new ArrayList<String>();
		 times= new ArrayList<String>();
		 menus= new ArrayList<String>();
		 
	      for(int i=0;i<array_list.size();i++){
	    	  
	         names.add(array_list.get(i).getDietName()) ;
	         times.add(array_list.get(i).getDietTime()) ;
	         menus.add(array_list.get(i).getDietMenu()) ;
		      
	      }
		 
		 setListAdapter(new DietListAdapter(this, names,times,menus));
		 //TextView menu=(TextView)findViewById(R.id.dietMenu);
		// String men=menu.getText().toString();
		 //Toast.makeText(this, String.valueOf(men.length()), Toast.LENGTH_SHORT).show();
	}
	

}
