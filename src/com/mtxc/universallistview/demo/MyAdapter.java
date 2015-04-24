package com.mtxc.universallistview.demo;

import java.util.List;

import com.mtxc.universallistview.R;
import com.mtxc.universallistview.UniversalAdapter;
import com.mtxc.universallistview.ViewHolder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends UniversalAdapter<Data> {

	public MyAdapter(Context context, List<Data> datas, int itemLayoutId) {
		super(context, datas, itemLayoutId);
	}

	@Override
	public void updateItem(ViewHolder holder, Data t) {
		((ImageView)holder.getView(R.id.iv_head)).setImageResource(t.getHeadImage());
		((TextView)holder.getView(R.id.tv_name)).setText(t.getName());
		((TextView)holder.getView(R.id.tv_blog)).setText(t.getBlog());
		((TextView)holder.getView(R.id.tv_praise)).setText("‘ﬁ(" + t.getPraise() + ")");
		((TextView)holder.getView(R.id.tv_browse)).setText("‰Ø¿¿(" + t.getBrowse() + ")");
		((TextView)holder.getView(R.id.tv_comment)).setText("∆¿¬€(" + t.getComment() + ")");
	}

}
