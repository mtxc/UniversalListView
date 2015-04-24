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
	 * ��ʼ����ͼ
	 */
	private void initView() {
		listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
	}

	/**
	 * ��ʼ������
	 */
	private void initData() {
		datas = new ArrayList<Data>();
		datas.add(new Data(R.drawable.head1, "����", "��Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ����", 8, 11, 5));
		datas.add(new Data(R.drawable.head2, "����", "��Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ����", 3, 12, 4));
		datas.add(new Data(R.drawable.head3, "Сӣ", "��Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ����", 5, 14, 2));
		datas.add(new Data(R.drawable.head4, "������", "��Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ����",13, 13, 7));
		datas.add(new Data(R.drawable.head5, "ֹˮ", "��Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ����", 6, 11, 1));
		datas.add(new Data(R.drawable.head6, "����Ҳ", "��Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ���߻�Ӱ����", 3, 10, 8));
		adapter = new MyAdapter(this, datas, R.layout.list_item);
	}

}
