package com.shuvo.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class FTFLImageView extends ImageView {

	private int m_X;
	private int m_Y;
	int width = 0;
	int height = 0;

	public FTFLImageView(Context context, int width, int height) {
		super(context);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
		init();
	}

	public FTFLImageView(Context context, AttributeSet as) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	public FTFLImageView(Context context, AttributeSet as, int defStyle) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	public void init() {

		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
				150, 150);
		this.setImageResource(R.drawable.ic_launcher);
		this.setLayoutParams(layoutParams);

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub

		int x = (int) event.getRawX();
		int y = (int) event.getRawY();

		switch (event.getAction() & MotionEvent.ACTION_MASK) {

		case MotionEvent.ACTION_DOWN:
			RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) this
					.getLayoutParams();

			m_X = x - lParams.leftMargin;
			m_Y = y - lParams.topMargin;
			break;

		case MotionEvent.ACTION_MOVE:

			if ((m_X < 110 || (m_X + 110) > width)
					|| (m_Y < 110 || (m_Y + 110) > height)) {
				
				break;
			}
			RelativeLayout.LayoutParams layParams = (RelativeLayout.LayoutParams) this
					.getLayoutParams();
			layParams.leftMargin = x - m_X;
			layParams.topMargin = y - m_Y;
			layParams.rightMargin = -250;
			layParams.bottomMargin = -250;
			this.setLayoutParams(layParams);
			break;

		}
		this.invalidate();
		return true;
	}

}
