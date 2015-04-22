package com.mtxc.universallistview.demo;

import java.util.List;
import com.mtxc.universallistview.R;
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
		ViewHolder holder;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.list_item, null);
			holder = new ViewHolder();
			holder.headImage = (ImageView) convertView
					.findViewById(R.id.iv_head);
			holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
			holder.tvBlog = (TextView) convertView.findViewById(R.id.tv_blog);
			holder.tvPraise = (TextView) convertView
					.findViewById(R.id.tv_praise);
			holder.tvBrowse = (TextView) convertView
					.findViewById(R.id.tv_browse);
			holder.tvComment = (TextView) convertView
					.findViewById(R.id.tv_comment);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.headImage.setImageResource(datas.get(position).getHeadImage());
		holder.tvName.setText(datas.get(position).getName());
		holder.tvBlog.setText(datas.get(position).getBlog());
		holder.tvPraise.setText("‘ﬁ(" + datas.get(position).getPraise() + ")");
		holder.tvBrowse.setText("‰Ø¿¿(" + datas.get(position).getBrowse() + ")");
		holder.tvComment
				.setText("∆¿¬€(" + datas.get(position).getComment() + ")");
		return convertView;
	}

	private class ViewHolder {

		public ImageView headImage;

		public TextView tvName;

		public TextView tvBlog;

		public TextView tvPraise;

		public TextView tvBrowse;

		public TextView tvComment;

	}

}
