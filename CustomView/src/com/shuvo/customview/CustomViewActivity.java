package com.shuvo.customview;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class CustomViewActivity extends Activity implements OnTouchListener{
	
	private FTFLImageView m_imageView;
	private FTFLImageView m_imageTwo;
	private FTFLImageView m_imageThree;
	
	private ViewGroup m_rootLayout;
	
	DisplayMetrics metrics; 
	int width = 0, height = 0;
	//private int m_X;
	//private int m_Y;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		
		metrics = new DisplayMetrics();        
		 getWindowManager().getDefaultDisplay().getMetrics(metrics);


		 height = metrics.heightPixels;     
		 width = metrics.widthPixels;
		 Toast.makeText(this, "Width: " +width + "Height: " +height, Toast.LENGTH_LONG).show();
		
		m_rootLayout = (ViewGroup) findViewById(R.id.root);
		
		m_imageView = new FTFLImageView(this, width, height);
		//m_imageTwo = new FTFLImageView(this);
	//	m_imageThree = new FTFLImageView(this);
		
		m_rootLayout.addView(m_imageView);
		//m_rootLayout.addView(m_imageTwo);
		//m_rootLayout.addView(m_imageThree);
		
		m_imageView.setOnTouchListener(this);
		//m_imageTwo.setOnTouchListener(this);
		//m_imageThree.setOnTouchListener(this);

		
/*		m_imageView = (ImageView) m_rootLayout.findViewById(R.id.imageView);
		
		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150,150);
		
		m_imageView.setLayoutParams(layoutParams);
		m_imageView.setOnTouchListener(this);*/
		
		
		/*RelativeLayout layout = (RelativeLayout) findViewById(R.id.root);
		//Toast.makeText(this, "here is the toast", Toast.LENGTH_LONG).show();
		
		layout.setOnTouchListener(this);*/
		
		// create a text view object and add it to the layout
		
		/*FTFLTextView tvName = new FTFLTextView(this);
        layout.addView(tvName);*/
        
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

/*	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		
		int x = (int) event.getRawX(); 
		int y = (int) event.getRawY();
		
		switch(event.getAction() & MotionEvent.ACTION_MASK){
		
		case MotionEvent.ACTION_DOWN:
			RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
			
			m_X = x - lParams.leftMargin;
			m_Y = y - lParams.topMargin;
			break;
			
		case MotionEvent.ACTION_MOVE:
			RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) v.getLayoutParams();
			layoutParams.leftMargin = x - m_X;
			layoutParams.topMargin = y - m_Y;
			layoutParams.rightMargin = -250;
			layoutParams.bottomMargin = -250;
			v.setLayoutParams(layoutParams);
			break;
		}
		m_rootLayout.invalidate();
		
		if( (event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_UP)
		{
		Toast.makeText(this, "UP X: " +x + "Y: " +y, Toast.LENGTH_SHORT).show();
		}
		else if( (event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN)
		{
		Toast.makeText(this, "DOWN X: " +x + "Y: " +y, Toast.LENGTH_SHORT).show();
		}
		else if( (event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_MOVE)
		{
		Toast.makeText(this, "MOVE X: " +x + "Y: " +y, Toast.LENGTH_SHORT).show();
		}
		return true;
	}*/


}
