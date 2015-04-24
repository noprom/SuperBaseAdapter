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
    public void convert(ViewHolder viewHolder, Bean bean) {
        ((TextView)viewHolder.getView(R.id.title)).setText(bean.getTitle());
        ((TextView)viewHolder.getView(R.id.desc)).setText(bean.getDesc());
        ((TextView)viewHolder.getView(R.id.time)).setText(bean.getTime());
        ((TextView)viewHolder.getView(R.id.phone)).setText(bean.getPhone());
    }

}
