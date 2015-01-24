package com.ftfl.icare;

import android.database.sqlite.SQLiteDatabase;



public class Profile {
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public String name;
	public String fathersName;
	public String mothersName;	
	public String weight;
	public String height;
	public String dateOfBirth;	
	

	String id;


public Profile(String mId, String mName, String mFathersName,
		String mMothersName,  
		String mWeight, String mHeight, String mDateOfBirth)
		 {
	id = mId;
	name = mName;
	fathersName = mFathersName;
	mothersName = mMothersName;	
	weight = mWeight;
	height = mHeight;
	dateOfBirth = mDateOfBirth;
	
	
}

public Profile(String name, String fathersName, String mothersName,
		String weight, String height, String dateOfBirth) {
	super();
	this.name = name;
	this.fathersName = fathersName;
	this.mothersName = mothersName;
	this.weight = weight;
	this.height = height;
	this.dateOfBirth = dateOfBirth;
}
public Profile() {
	// TODO Auto-generated constructor stub
}

}
