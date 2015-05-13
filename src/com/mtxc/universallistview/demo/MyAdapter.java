package com.mtxc.universallistview.demo;

import java.util.List;
import android.content.Context;
import com.mtxc.universallistview.R;
import com.mtxc.universallistview.UniversalAdapter;
import com.mtxc.universallistview.ViewHolder;

public class MyAdapter extends UniversalAdapter<Data> {

	public MyAdapter(Context context, List<Data> datas, int itemLayoutId) {
		super(context, datas, itemLayoutId);
	}

	@Override
	public void updateItem(ViewHolder holder, Data t) {
		holder.setImageViewImageResource(R.id.iv_head, t.getHeadImage())
				.setTextViewText(R.id.tv_name, t.getName())
				.setTextViewText(R.id.tv_blog, t.getBlog())
				.setTextViewText(R.id.tv_praise, "赞(" + t.getPraise() + ")")
				.setTextViewText(R.id.tv_browse, "浏览(" + t.getBrowse() + ")")
				.setTextViewText(R.id.tv_comment, "评论(" + t.getComment() + ")");
	}

}
