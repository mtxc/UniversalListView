package com.mtxc.universallistview;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * ���ܵ�ListView��������
 *
 * @param <T> ��Ҫ�󶨵���������
 */
public abstract class UniversalAdapter<T> extends BaseAdapter {
	
	protected Context context;
	
	protected LayoutInflater inflater;
	
	protected List<T> datas;
	
	private int itemLayoutId;
	
	public UniversalAdapter(Context context, List<T> datas, int itemLayoutId){
		this.context = context;
		this.inflater = LayoutInflater.from(context);
		this.datas = datas;
		this.itemLayoutId = itemLayoutId;
	}

	@Override
	public int getCount() {
		return datas.size();
	}

	@Override
	public T getItem(int position) {
		return datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = ViewHolder.get(context, position, convertView, itemLayoutId, parent);
		updateItem(holder, getItem(position));
		return holder.getConvertView();
	}
	
	/**
	 * �������������ÿؼ�ֵ�ĳ��󷽷�
	 * @param holder
	 * @param data
	 */
	public abstract void updateItem(ViewHolder holder, T data);

}
