package com.mtxc.universallistview;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
	
	/*************************�����ǶԾ���ؼ�������Դ�ķ�����������...**************************/
	
	/**
	 * TextView���
	 */
	public ViewHolder setTextViewText(int viewId, String text){
		TextView tv = getView(viewId);
		tv.setText(text);
		return this;
	}
	public ViewHolder setTextViewText(int viewId, int resId){
		TextView tv = getView(viewId);
		tv.setText(resId);
		return this;
	}
	
	/**
	 * ImageView���
	 */
	public ViewHolder setImageViewImageResource(int viewId, int resId){
		ImageView iv = getView(viewId);
		iv.setImageResource(resId);
		return this;
	}
	public ViewHolder setImageViewAlpha(int viewId, float alpha){
		ImageView iv = getView(viewId);
		iv.setAlpha(alpha);
		return this;
	}
	
}
