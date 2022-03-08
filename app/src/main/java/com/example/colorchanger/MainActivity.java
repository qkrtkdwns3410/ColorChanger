package com.example.colorchanger;

import static androidx.fragment.app.FragmentStatePagerAdapter.*;

import java.util.ArrayList;

import com.orhanobut.logger.Logger;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
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
	  
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			// definition of pager using method findViewById()
			pager = findViewById(R.id.pager);
			
			// calling the constructor of viewPager class
			viewPager = new viewPager(getSupportFragmentManager(), 1);
			pager.setAdapter(viewPager);
	  }
	  
}


