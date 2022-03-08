package com.example.colorchanger;

import static androidx.fragment.app.FragmentStatePagerAdapter.*;

import java.util.ArrayList;

import com.orhanobut.logger.Logger;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
	  
	  public static int R_VALUE = 0;
	  public static int G_VALUE = 0;
	  public static int B_VALUE = 0;
	  
	  OnSwipeTouchListener onSwipeTouchListener;
	  public FrameLayout container;
	  
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			container = findViewById(R.id.container);
			
			onSwipeTouchListener = new OnSwipeTouchListener(this, findViewById(R.id.container));
	  }
	  
	  public static class OnSwipeTouchListener implements View.OnTouchListener {
			private final GestureDetector gestureDetector;
			Context context;
			
			OnSwipeTouchListener(Context ctx, View mainView) {
				  gestureDetector = new GestureDetector(ctx, new GestureListener());
				  mainView.setOnTouchListener(this);
				  context = ctx;
			}
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				  return gestureDetector.onTouchEvent(event);
			}
			
			public class GestureListener extends
				GestureDetector.SimpleOnGestureListener {
				  private static final int SWIPE_THRESHOLD = 100;
				  private static final int SWIPE_VELOCITY_THRESHOLD = 100;
				  
				  @Override
				  public boolean onDown(MotionEvent e) {
						return true;
				  }
				  
				  @Override
				  public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
						boolean result = false;
						try {
							  float diffY = e2.getY() - e1.getY();
							  float diffX = e2.getX() - e1.getX();
							  if (Math.abs(diffX) > Math.abs(diffY)) {
									if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
										  if (diffX > 0) {
												onSwipeRight();
												
										  } else {
												onSwipeLeft();
										  }
										  
										  result = true;
									}
							  } else if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
									if (diffY > 0) {
										  onSwipeBottom();
									} else {
										  onSwipeTop();
									}
									result = true;
							  }
						} catch (Exception exception) {
							  exception.printStackTrace();
						}
						return result;
				  }
			}
			
			void onSwipeRight() {
				  Toast.makeText(context, "Swiped Right", Toast.LENGTH_SHORT).show();
				  container.setBackgroundColor();
				  this.onSwipe.swipeRight();
				  
			}
			
			void onSwipeLeft() {
				  Toast.makeText(context, "Swiped Left", Toast.LENGTH_SHORT).show();
				  this.onSwipe.swipeLeft();
			}
			
			void onSwipeTop() {
				  Toast.makeText(context, "Swiped Up", Toast.LENGTH_SHORT).show();
				  this.onSwipe.swipeTop();
			}
			
			void onSwipeBottom() {
				  Toast.makeText(context, "Swiped Down", Toast.LENGTH_SHORT).show();
				  this.onSwipe.swipeBottom();
			}
			
			interface onSwipeListener {
				  void swipeRight();
				  
				  void swipeTop();
				  
				  void swipeBottom();
				  
				  void swipeLeft();
			}
			
			onSwipeListener onSwipe;
	  }
	  
}


