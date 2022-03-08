package com.example.colorchanger;

import java.util.logging.LogManager;

import com.example.colorchanger.listener.OnSwipeTouchListener;
import com.orhanobut.logger.Logger;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

public class MainActivity extends AppCompatActivity {
	  
	  public static int R_VALUE = 50;
	  public static int G_VALUE = 205;
	  public static int B_VALUE = 50;
	  
	  LinearLayout container;
	  Button button;
	  
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			container = findViewById(R.id.container);
			button = findViewById(R.id.initBtn);
			
			button.setOnClickListener(new View.OnClickListener() {
				  @Override
				  public void onClick(View view) {
						container.setBackgroundColor(Color.parseColor("#32CD32"));
						
				  }
			});
			
			container.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
				  
				  @Override
				  public boolean onTouch(View view, MotionEvent motionEvent) {
						Logger.d("onTouch() called with: view = [" + view + "], motionEvent = [" + motionEvent + "]");
						
						return super.onTouch(view, motionEvent);
						
				  }
				  
				  @Override
				  public void onSwipeUpReverse() {
						super.onSwipeUpReverse();
						
						Toast.makeText(MainActivity.this, "onSwipeUpReverse", Toast.LENGTH_SHORT).show();
						
						G_VALUE -= 10;
						Logger.d("G_VALUE  " + G_VALUE);
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
				  }
				  
				  @Override
				  public void onSwipeLeftReverse() {
						super.onSwipeLeftReverse();
						Toast.makeText(MainActivity.this, "onSwipeLeftReverse", Toast.LENGTH_SHORT).show();
						
						B_VALUE -= 10;
						Logger.d("B_VALUE  " + B_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
				  @Override
				  public void onSwipeRightReverse() {
						super.onSwipeRightReverse();
						Toast.makeText(MainActivity.this, "onSwipeRightReverse", Toast.LENGTH_SHORT).show();
						
						R_VALUE -= 10;
						Logger.d("R_VALUE  " + R_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
				  @Override
				  public void onSwipeRight() {
						super.onSwipeRight();
						
						Toast.makeText(MainActivity.this, "onSwipeRight", Toast.LENGTH_SHORT).show();
						
						R_VALUE += 10;
						Logger.d("R_VALUE  " + R_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
				  }
				  
				  @Override
				  public void onSwipeUp() {
						super.onSwipeUp();
						
						Toast.makeText(MainActivity.this, "onSwipeUp", Toast.LENGTH_SHORT).show();
						
						G_VALUE += 10;
						Logger.d("G_VALUE  " + G_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
				  @Override
				  public void onSwipeLeft() {
						super.onSwipeLeft();
						
						Toast.makeText(MainActivity.this, "onSwipeLeft", Toast.LENGTH_SHORT).show();
						
						B_VALUE += 10;
						Logger.d("B_VALUE  " + B_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
			});
	  }
	  
	  @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
	  public static int getScreenWidth(Activity activity) {
			Display display = activity.getWindowManager().getDefaultDisplay();  // in Activity
			/* getActivity().getWindowManager().getDefaultDisplay() */ // in Fragment
			Point size = new Point();
			display.getRealSize(size); // or getSize(size)
			int width = size.x;
			
			return width;
	  }
	  
	  @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
	  public static int getScreenHeight(Activity activity) {
			Display display = activity.getWindowManager().getDefaultDisplay();  // in Activity
			/* getActivity().getWindowManager().getDefaultDisplay() */ // in Fragment
			Point size = new Point();
			display.getRealSize(size); // or getSize(size)
			int height = size.y;
			
			return height;
	  }
	  
	  public void onSwipeUpReverse() {
			
	  }
	  
	  public void onSwipeDownReverse() {
			
	  }
	  
	  public void onSwipeLeftReverse() {
			
	  }
	  
	  public void onSwipeRightReverse() {
			
	  }
	  
	  public void onSwipeRight() {
			
	  }
	  
	  public void onSwipeLeft() {
	  }
	  
	  public void onSwipeUp() {
			
	  }
	  
	  public void onSwipeDown() {
			
	  }
	  
	  private void onClick() {
			
	  }
	  
	  private void onDoubleClick() {
			
	  }
	  
	  private void onLongClick() {
			
	  }
	  
}


