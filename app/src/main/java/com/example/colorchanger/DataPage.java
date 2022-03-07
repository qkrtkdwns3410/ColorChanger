package com.example.colorchanger;

/**
 *packageName    : com.example.colorchanger
 * fileName       : DataPage
 * author         : ipeac
 * date           : 2022-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-07        ipeac       최초 생성
 */
public class DataPage {
	  int color;
	  String title;
	  
	  public DataPage(int color, String title) {
			this.color = color;
			this.title = title;
	  }
	  
	  public int getColor() {
			return color;
	  }
	  
	  public void setColor(int color) {
			this.color = color;
	  }
	  
	  public String getTitle() {
			return title;
	  }
	  
	  public void setTitle(String title) {
			this.title = title;
	  }
}



























