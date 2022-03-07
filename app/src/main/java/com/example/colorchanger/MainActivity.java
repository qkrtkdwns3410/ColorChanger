package com.example.colorchanger;

import static androidx.fragment.app.FragmentStatePagerAdapter.*;

import java.util.ArrayList;

import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
	  
	  ViewPager2 viewPager2;
	  Button btnToggle;
	  
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			viewPager2 = findViewById(R.id.viewPager2);
			btnToggle = findViewById(R.id.btnToggle);
			
			ArrayList<DataPage> list = new ArrayList<>();
			
			list.add(new DataPage(android.R.color.black, "1 Page"));
			list.add(new DataPage(android.R.color.holo_red_light, "2 Page"));
			list.add(new DataPage(android.R.color.holo_green_dark, "3 Page"));
			list.add(new DataPage(android.R.color.holo_orange_dark, "4 Page"));
			list.add(new DataPage(android.R.color.holo_blue_light, "5 Page"));
			list.add(new DataPage(android.R.color.holo_blue_bright, "6 Page"));
			
			viewPager2.setAdapter(new ViewPagerAdapter(list));
			
			btnToggle.setOnClickListener(new View.OnClickListener() {
				  @Override
				  public void onClick(View v) {
						if (viewPager2.getOrientation() == ViewPager2.ORIENTATION_VERTICAL) {
							  btnToggle.setText("가로로 슬라이드");
							  viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
						} else {
							  btnToggle.setText("세로로 슬라이드");
							  viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
						}
				  }
			});
	  }
}


