package com.mtxc.universallistview;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewHolder {

	/**
	 * �洢item�е�������ͼ�ؼ�
	 */
	private SparseArray<View> mViews;

	private int mPosition;

	private View mConvertView;

	/**
	 * ViewHolder�Ĺ��췽��
	 * 
	 * @param context
	 *            ����������
	 * @param position
	 *            item����λ��
	 * @param itemLayoutId
	 *            item�Ĳ����ļ�
	 * @param parent
	 *            ���ؼ�
	 */
	public ViewHolder(Context context, int position, int itemLayoutId,
			ViewGroup parent) {
		this.mPosition = position;
		this.mViews = new SparseArray<View>();
		mConvertView = LayoutInflater.from(context).inflate(itemLayoutId,
				parent, false);
		mConvertView.setTag(this);
	}

	/**
	 * ��ȡViewHolder����ڷ���
	 * 
	 * @param context
	 *            ����������
	 * @param position
	 *            item����λ��
	 * @param convertView
	 *            adapter�����convertView
	 * @param itemLayoutId
	 *            item�Ĳ����ļ�
	 * @param parent
	 *            ���ؼ�
	 * @return
	 */
	public static ViewHolder get(Context context, int position,
			View convertView, int itemLayoutId, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder(context, position, itemLayoutId, parent);
		} else {
			holder = (ViewHolder) convertView.getTag();
			holder.mPosition = position;
		}
		return holder;
	}

	/**
	 * ����id��ȡitem�еĿؼ�
	 * 
	 * @param viewId
	 *            �ؼ�id
	 * @return �ؼ�����
	 */
	public <T extends View> T getView(int viewId) {
		View view = mViews.get(viewId);
		if (view == null) {
			view = mConvertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T) view;
	}

	/**
	 * ����������convertView
	 * 
	 * @return
	 */
	public View getConvertView() {
		return mConvertView;
	}
}
