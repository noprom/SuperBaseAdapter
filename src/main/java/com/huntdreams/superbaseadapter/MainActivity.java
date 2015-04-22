package com.huntdreams.superbaseadapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.huntdreams.superbaseadapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView mListView;
    private List<Bean> mDatas;
    private MyAdapter mAdapter;

    private SuperAdapter spAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initView();
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.listview);
//        mListView.setAdapter(mAdapter);
        mListView.setAdapter(spAdapter);
    }

    private void initDatas() {
        mDatas = new ArrayList<Bean>();
        for (int i=0;i<5;++i){
            Bean bean = new Bean("猎梦网"+i,"这是北京猎梦科技啊啊","2015-04-25","18819555555");
            mDatas.add(bean);
        }
//        mAdapter = new MyAdapter(this,mDatas);

        spAdapter = new SuperAdapter(this,mDatas);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
