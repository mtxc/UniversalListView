package com.mtxc.universallistview.demo;

import java.util.List;

import com.mtxc.universallistview.R;
import com.mtxc.universallistview.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private Context context;
	
	private LayoutInflater inflater;

	private List<Data> datas;

	public MyAdapter(Context context, List<Data> datas) {
		this.context = context;
		this.inflater = LayoutInflater.from(context);
		this.datas = datas;
	}

	@Override
	public int getCount() {
		return datas.size();
	}

	@Override
	public Object getItem(int position) {
		return datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = ViewHolder.get(context, position, convertView, R.layout.list_item, parent);
		((ImageView)holder.getView(R.id.iv_head)).setImageResource(datas.get(position).getHeadImage());
		((TextView)holder.getView(R.id.tv_name)).setText(datas.get(position).getName());
		((TextView)holder.getView(R.id.tv_blog)).setText(datas.get(position).getBlog());
		((TextView)holder.getView(R.id.tv_praise)).setText("‘ﬁ(" + datas.get(position).getPraise() + ")");
		((TextView)holder.getView(R.id.tv_browse)).setText("‰Ø¿¿(" + datas.get(position).getBrowse() + ")");
		((TextView)holder.getView(R.id.tv_comment)).setText("∆¿¬€(" + datas.get(position).getComment() + ")");
		return holder.getConvertView();
	}

}
