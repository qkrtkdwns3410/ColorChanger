package com.example.colorchanger;

import com.orhanobut.logger.Logger;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainColorChangeActivity extends AppCompatActivity {
	  GestureDetector mGestureDetector;
	  DisplayMetrics displayMetrics;
	  
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main_color_change);
		 
			Display display = getWindowManager().getDefaultDisplay();  // in Activity
			/* getActivity().getWindowManager().getDefaultDisplay() */ // in Fragment
			Point size = new Point();
			display.getRealSize(size); // or getSize(size)
			float width = size.x;
			int height = size.y;
			
			DisplayMetrics displayMetrics= getResources().getDisplayMetrics();
			float densityDpi=displayMetrics.densityDpi;
			float defaultDPI = DisplayMetrics.DENSITY_DEFAULT;
		 
			//dp 로 변환 가로 세로
			width *= (densityDpi / defaultDPI);
			height *= (densityDpi / defaultDPI);
			
			Logger.d("--------------------------------------");
			Logger.d("width : " + width);
			Logger.d("height : " + height);
			Logger.d("--------------------------------------");
	  }
	  
	  
	  
	  
	  //픽셀을 dp로
	  public static float convertPixelsToDp(float px, Context context){
			return px / ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
	  }
}