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
	 * 存储item中的所有视图控件
	 */
	private SparseArray<View> mViews;

	private int mPosition;

	private View mConvertView;

	/**
	 * ViewHolder的构造方法
	 * 
	 * @param context
	 *            传入上下文
	 * @param position
	 *            item所在位置
	 * @param itemLayoutId
	 *            item的布局文件
	 * @param parent
	 *            父控件
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
	 * 获取ViewHolder的入口方法
	 * 
	 * @param context
	 *            传入上下文
	 * @param position
	 *            item所在位置
	 * @param convertView
	 *            adapter传入的convertView
	 * @param itemLayoutId
	 *            item的布局文件
	 * @param parent
	 *            父控件
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
	 * 根据id获取item中的控件
	 * 
	 * @param viewId
	 *            控件id
	 * @return 控件对象
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
	 * 用于外界访问convertView
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
