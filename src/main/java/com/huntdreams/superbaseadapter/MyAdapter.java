package com.huntdreams.superbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.huntdreams.superbaseadapter.bean.Bean;

import java.util.List;

/**
 * Created by noprom on 2015/4/23.
 */
public class MyAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Bean> mDatas;

    public MyAdapter(Context context,List<Bean> datas){
        this.mInflater = LayoutInflater.from(context);
        this.mDatas = datas;
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
        ViewHolder viewHolder  = null;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.item_listview,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.mTitle = (TextView) convertView.findViewById(R.id.title);
            viewHolder.mDesc = (TextView) convertView.findViewById(R.id.desc);
            viewHolder.mTime = (TextView) convertView.findViewById(R.id.title);
            viewHolder.mPhone = (TextView) convertView.findViewById(R.id.phone);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Bean bean = mDatas.get(position);
        viewHolder.mTitle.setText(bean.getTitle());
        viewHolder.mDesc.setText(bean.getDesc());
        viewHolder.mTime.setText(bean.getTime());
        viewHolder.mPhone.setText(bean.getPhone());

        return convertView;
    }

    private class ViewHolder{
        TextView mTitle;
        TextView mDesc;
        TextView mTime;
        TextView mPhone;
    }
}
