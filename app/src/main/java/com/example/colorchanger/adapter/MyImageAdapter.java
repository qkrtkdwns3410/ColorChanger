package com.example.colorchanger.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;

/**
 *packageName    : com.example.colorchanger.adapter
 * fileName       : MyImageAdapter
 * author         : ipeac
 * date           : 2022-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-07        ipeac       최초 생성
 */
public class MyImageAdapter extends PagerAdapter {
	  Context context;
	  
	  public MyImageAdapter(Context context) {
			this.context = context;
	  }
	  
	  @Override
	  public int getCount() {
			//전체 페이지 수
			return 5;
	  }
	  
	  @Override
	  public boolean isViewFromObject(View view, Object object) {
			return view == object;
	  }
	  
	  @Override
	  public Object instantiateItem(ViewGroup container, int position) {
			TextView my_textview = new TextView(context);
			my_textview.setText("페이지 NO = " + position);
			
			container.addView(my_textview, 0);
			return my_textview;
	  }
	  
	  @Override
	  public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((TextView)object);
	  }
}




























