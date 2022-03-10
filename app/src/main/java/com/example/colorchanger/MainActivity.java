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
import android.widget.TextView;
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
	  TextView r_TV;
	  TextView g_TV;
	  TextView b_TV;
	  
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
			
			try {
				  super.onCreate(savedInstanceState);
				  setContentView(R.layout.activity_main);
				  
				  container = findViewById(R.id.container);
				  button = findViewById(R.id.initBtn);
				  
				  g_TV = findViewById(R.id.idTV_Gvalue);
				  r_TV = findViewById(R.id.idTV_Rvalue);
				  b_TV = findViewById(R.id.idTV_Bvalue);
				  
				  r_TV.setText(R_VALUE + "");
				  r_TV.setTextColor(getResources().getColor(R.color.red));
				  //
				  g_TV.setText(G_VALUE + "");
				  g_TV.setTextColor(getResources().getColor(R.color.green));
				  //
				  b_TV.setText(B_VALUE + "");
				  b_TV.setTextColor(getResources().getColor(R.color.blue));
			} catch (Exception e) {
				  e.printStackTrace();
			}
			
			button.setOnClickListener(new View.OnClickListener() {
				  @Override
				  public void onClick(View view) {
						container.setBackgroundColor(Color.parseColor("#32CD32"));
						R_VALUE = 50;
						G_VALUE = 205;
						B_VALUE = 50;
						
						r_TV.setText(R_VALUE + "");
						g_TV.setText(G_VALUE + "");
						b_TV.setText(B_VALUE + "");
						
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
						g_TV.setText(G_VALUE + "");
						Logger.d("G_VALUE  " + G_VALUE);
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
				  }
				  
				  @Override
				  public void onSwipeLeftReverse() {
						super.onSwipeLeftReverse();
						Toast.makeText(MainActivity.this, "onSwipeLeftReverse", Toast.LENGTH_SHORT).show();
						
						B_VALUE -= 10;
						b_TV.setText(B_VALUE + "");
						Logger.d("B_VALUE  " + B_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
				  @Override
				  public void onSwipeRightReverse() {
						super.onSwipeRightReverse();
						Toast.makeText(MainActivity.this, "onSwipeRightReverse", Toast.LENGTH_SHORT).show();
						
						R_VALUE -= 10;
						r_TV.setText(R_VALUE + "");
						Logger.d("R_VALUE  " + R_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
				  @Override
				  public void onSwipeRight() {
						super.onSwipeRight();
						
						Toast.makeText(MainActivity.this, "onSwipeRight", Toast.LENGTH_SHORT).show();
						
						R_VALUE += 10;
						r_TV.setText(R_VALUE + "");
						Logger.d("R_VALUE  " + R_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
				  }
				  
				  @Override
				  public void onSwipeUp() {
						super.onSwipeUp();
						
						Toast.makeText(MainActivity.this, "onSwipeUp", Toast.LENGTH_SHORT).show();
						
						G_VALUE += 10;
						g_TV.setText(G_VALUE + "");
						Logger.d("G_VALUE  " + G_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
				  @Override
				  public void onSwipeLeft() {
						super.onSwipeLeft();
						
						Toast.makeText(MainActivity.this, "onSwipeLeft", Toast.LENGTH_SHORT).show();
						
						B_VALUE += 10;
						b_TV.setText(B_VALUE + "");
						Logger.d("B_VALUE  " + B_VALUE);
						
						container.setBackgroundColor(Color.rgb(R_VALUE, G_VALUE, B_VALUE));
						
				  }
				  
			});
	  }
	  
}


