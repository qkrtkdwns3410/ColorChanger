package com.example.colorchanger;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import android.app.Application;

/**
 *packageName    : com.example.colorchanger
 * fileName       : BaseAPP
 * author         : letscombine
 * date           : 2022-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-02        letscombine       최초 생성
 */
public class BaseAPP extends Application {
	  
	  @Override
	  public void onCreate() {
			super.onCreate();
			
			Logger.addLogAdapter(new AndroidLogAdapter() {
				  @Override
				  public boolean isLoggable(int priority, String tag) {
						return true;
				  }
			});
	  }
}

























