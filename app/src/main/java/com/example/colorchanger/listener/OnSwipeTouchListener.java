package com.example.colorchanger.listener;

import java.util.MissingFormatArgumentException;

import com.example.colorchanger.MainActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.annotation.RequiresApi;

/**
 *packageName    : com.example.colorchanger.listener
 * fileName       : OnSwipeTouchListener
 * author         : letscombine
 * date           : 2022-03-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-08        letscombine       최초 생성
 */
public class OnSwipeTouchListener implements OnTouchListener {
	  private GestureDetector gestureDetector;
	  MainActivity mainActivity;
	  
	  public OnSwipeTouchListener(Context c) {
			gestureDetector = new GestureDetector(c, new GestureListener());
	  }
	  
	  public boolean onTouch(final View view, final MotionEvent motionEvent) {
			return gestureDetector.onTouchEvent(motionEvent);
	  }
	  
	  private final class GestureListener extends
		  GestureDetector.SimpleOnGestureListener {
			
			@Override
			public boolean onSingleTapUp(MotionEvent e) {
				  onClick();
				  return super.onSingleTapUp(e);
			}
			
			@Override
			public void onLongPress(MotionEvent e) {
				  onLongClick();
				  super.onLongPress(e);
			}
			
			@Override
			public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
				  try {
						int x_e1 = (int)e1.getX();
						int y_e1 = (int)e1.getY();
						
						int x_e2 = (int)e2.getX();
						int y_e2 = (int)e2.getY();
						
						float diffY = e2.getY() - e1.getY();
						float diffX = e2.getX() - e1.getX();
						
						if (Math.abs(diffX) > Math.abs(diffY)) {
							  if (Math.abs(diffX) > 200) {
									if (diffX > 0) {
										  if (x_e1 < 590 && x_e2 > 590) {
												onSwipeRight();
										  }
									} else {
										  if (x_e1 > 590 / 2 && x_e2 < 590) {
												onSwipeLeft();
										  }
									}
							  } else if (Math.abs(diffX) < 50) {
									if (diffX > 0) {
										  if (x_e1 > 590 && x_e2 > 590) {
												onSwipeRightReverse();
										  }
									} else {
										  if (x_e1 < 590 && x_e2 < 590) {
												onSwipeLeftReverse();
												
										  }
									}
							  }
						} else {
							  if (Math.abs(diffY) > 200) {
									if (diffY > 0) {
										  if (y_e1 > 1650 && y_e2 > 1650) {
												onSwipeUpReverse();
												
										  }
										  
									} else {
										  if (y_e1 > 1650 && y_e2 < 1650) {
												onSwipeUp();
												
										  }
									}
							  } else {
									if (diffY < 0) {
										  if (y_e1 > 1650 && y_e2 > 1650) {
												onSwipeUpReverse();
												
										  }
									}
									
							  }
						}
				  } catch (Exception exception) {
						exception.printStackTrace();
				  }
				  return false;
			}
			
			@Override
			public boolean onDown(MotionEvent e) {
				  return true;
			}
			
			@Override
			public boolean onDoubleTap(MotionEvent e) {
				  onDoubleClick();
				  return super.onDoubleTap(e);
			}
	  }
	  
	  public void onSwipeUpReverse() {
			
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
	  
	  private void onClick() {
	  }
	  
	  private void onDoubleClick() {
	  }
	  
	  private void onLongClick() {
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
}

























