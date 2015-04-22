package com.huntdreams.superbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huntdreams.superbaseadapter.bean.Bean;
import com.huntdreams.superbaseadapter.utils.ViewHolder;
import com.huntdreams.www.myapplication.R;

import java.util.List;

/**
 * Created by noprom on 2015/4/23.
 */
public class SuperAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Bean> mDatas;
    private Context mContext;

    public SuperAdapter(Context context, List<Bean> datas){
        this.mInflater = LayoutInflater.from(context);
        this.mDatas = datas;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = ViewHolder.get(mContext,convertView,parent,R.layout.item_listview,position);
        Bean bean = mDatas.get(position);

        TextView title =viewHolder.getView(R.id.title);
        title.setText(bean.getTitle());

        TextView desc =viewHolder.getView(R.id.desc);
        desc.setText(bean.getDesc());

        TextView time =viewHolder.getView(R.id.time);
        time.setText(bean.getTime());

        TextView phone =viewHolder.getView(R.id.phone);
        phone.setText(bean.getPhone());

        return viewHolder.getConvertView();
    }


}
