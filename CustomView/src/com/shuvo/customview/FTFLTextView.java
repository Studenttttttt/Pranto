package com.shuvo.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


public class FTFLTextView extends TextView {
	
	String m_Text = "Type your name here";

	public FTFLTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public FTFLTextView(Context context, AttributeSet as) {
		super(context, as);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public FTFLTextView(Context context,AttributeSet as, int defStyle) {
		super(context, as, defStyle);
		// TODO Auto-generated constructor stub
		init();
	}

	public void init(){
		this.setText(m_Text);
	}
}
