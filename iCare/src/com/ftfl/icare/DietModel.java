package com.ftfl.icare;

public class DietModel {
	int mDietId,profileId;
	String mDietName;
	String mDietTime;
	String mDietMenu;
	public DietModel( String dietName, String dietTime,
			String dietMenu) {
		super();
		
		mDietName = dietName;
		mDietTime = dietTime;
		mDietMenu = dietMenu;
	}
	
	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public int getDietId() {
		return mDietId;
	}
	public void setDietId(int dietId) {
		mDietId = dietId;
	}
	public String getDietName() {
		return mDietName;
	}
	public String getDietTime() {
		return mDietTime;
	}
	public String getDietMenu() {
		return mDietMenu;
	}
	
	

}
