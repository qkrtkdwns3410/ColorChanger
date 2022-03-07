package com.example.colorchanger;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 *packageName    : com.example.colorchanger
 * fileName       : PageFragment
 * author         : ipeac
 * date           : 2022-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-07        ipeac       최초 생성
 */
public class ViewPagerAdapter extends RecyclerView.Adapter<ViewHolderPage> {
	  
	  private ArrayList<DataPage> listData;
	  
	  ViewPagerAdapter(ArrayList<DataPage> data) {
			this.listData = data;
	  }
	  
	  @Override
	  public ViewHolderPage onCreateViewHolder(ViewGroup parent, int viewType) {
			Context context = parent.getContext();
			View view = LayoutInflater.from(context).inflate(R.layout.item_viewpager, parent, false);
			return new ViewHolderPage(view);
	  }
	  
	  @Override
	  public void onBindViewHolder(ViewHolderPage holder, int position) {
			if (holder instanceof ViewHolderPage) {
				  ViewHolderPage viewHolder = (ViewHolderPage)holder;
				  viewHolder.onBind(listData.get(position));
				  
			}
	  }
	  
	  @Override
	  public int getItemCount() {
			return listData.size();
	  }
	  
	  // int page;
	  // TextView tv_num;
	  // public static int TOTAL_COUNT = 0;
	  //
	  // public static PageFragment newInstance(int page) {
	  // 	PageFragment fragment = new PageFragment();
	  // 	fragment.page = page;
	  // 	return fragment;
	  // }
	  //
	  // @Nullable
	  // @Override
	  // public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
	  // 	View view = inflater.inflate(R.layout.fragment_page, container, false);
	  // 	tv_num = view.findViewById(R.id.tv_num);
	  // 	tv_num.setText(page + "");
	  // 	int color = Color.rgb(0, 0, 0);
	  // 	tv_num.setBackgroundColor(color);
	  // 	return view;
	  // }
}




























