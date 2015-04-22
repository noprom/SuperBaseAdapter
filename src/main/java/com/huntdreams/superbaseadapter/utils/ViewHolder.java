package com.huntdreams.superbaseadapter.utils;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by noprom on 2015/4/23.
 */
public class ViewHolder {
    private SparseArray<View> mViews;

    private int mPosition;

    private View mConvertView;

    public ViewHolder(Context context,ViewGroup parent,int layoutId,int position){
        this.mPosition = position;
        this.mViews = new SparseArray<View>();
        this.mConvertView = LayoutInflater.from(context).inflate(layoutId,parent,false);
        mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context,View convertView,ViewGroup parent,int position,int layoutId){
        if(convertView == null){
            return new ViewHolder(context,parent,layoutId,position);
        }else{
            ViewHolder holder = (ViewHolder) convertView.getTag();
            return holder;
        }
    }

    public View getConvertView() {
        return mConvertView;
    }
}
