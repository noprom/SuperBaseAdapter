package com.huntdreams.superbaseadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huntdreams.superbaseadapter.bean.Bean;
import com.huntdreams.superbaseadapter.utils.ViewHolder;

import java.util.List;

/**
 * Created by noprom on 2015/4/23.
 */
public class SuperAdapter extends CommonAdapter<Bean> {

    public SuperAdapter(Context context, List<Bean> datas){
        super(context,datas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = ViewHolder.get(mContext,convertView,parent,R.layout.item_listview,position);
        Bean bean = mDatas.get(position);

        ((TextView)viewHolder.getView(R.id.title)).setText(bean.getTitle());
        ((TextView)viewHolder.getView(R.id.desc)).setText(bean.getDesc());
        ((TextView)viewHolder.getView(R.id.time)).setText(bean.getTime());
        ((TextView)viewHolder.getView(R.id.phone)).setText(bean.getPhone());

        return viewHolder.getConvertView();
    }


}
