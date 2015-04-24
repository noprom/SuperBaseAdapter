package com.huntdreams.superbaseadapter;

import android.content.Context;

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
    public void convert(ViewHolder viewHolder, Bean bean) {
        viewHolder.setText(R.id.title,bean.getTitle())
                .setText(R.id.desc,bean.getDesc())
                .setText(R.id.time,bean.getTime())
                .setText(R.id.phone,bean.getPhone());
//        ((TextView)viewHolder.getView(R.id.title)).setText(bean.getTitle());
//        ((TextView)viewHolder.getView(R.id.desc)).setText(bean.getDesc());
//        ((TextView)viewHolder.getView(R.id.time)).setText(bean.getTime());
//        ((TextView)viewHolder.getView(R.id.phone)).setText(bean.getPhone());
    }

}
