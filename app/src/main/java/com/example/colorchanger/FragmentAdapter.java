package com.example.colorchanger;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 *packageName    : com.example.colorchanger
 * fileName       : FragmentAdapter
 * author         : letscombine
 * date           : 2022-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-02        letscombine       최초 생성
 */
public class FragmentAdapter extends FragmentStateAdapter {
	  
	  public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
			super(fragmentActivity);
	  }
	  
	  @NonNull
	  @Override
	  public Fragment createFragment(int position) {
			Fragment fragment = new ;
			return null;
	  }
	  
	  @Override
	  public int getItemCount() {
			return 0;
	  }
}

























