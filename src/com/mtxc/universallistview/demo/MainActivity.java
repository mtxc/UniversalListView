package com.mtxc.universallistview.demo;

import java.util.ArrayList;
import java.util.List;
import com.mtxc.universallistview.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView listView;
	
	private List<Data> datas;
	
	private MyAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initData();
		
		initView();
	}

	/**
	 * 初始化视图
	 */
	private void initView() {
		listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		datas = new ArrayList<Data>();
		datas.add(new Data(R.drawable.head1, "鸣人", "火影忍者火影忍者火影忍者火影忍者火影忍者", 8, 11, 5));
		datas.add(new Data(R.drawable.head2, "佐助", "火影忍者火影忍者火影忍者火影忍者火影忍者", 3, 12, 4));
		datas.add(new Data(R.drawable.head3, "小樱", "火影忍者火影忍者火影忍者火影忍者火影忍者", 5, 14, 2));
		datas.add(new Data(R.drawable.head4, "卡卡西", "火影忍者火影忍者火影忍者火影忍者火影忍者",13, 13, 7));
		datas.add(new Data(R.drawable.head5, "止水", "火影忍者火影忍者火影忍者火影忍者火影忍者", 6, 11, 1));
		datas.add(new Data(R.drawable.head6, "自来也", "火影忍者火影忍者火影忍者火影忍者火影忍者", 3, 10, 8));
		adapter = new MyAdapter(this, datas, R.layout.list_item);
	}

}
