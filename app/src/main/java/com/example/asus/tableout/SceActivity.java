package com.example.asus.tableout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/13.
 */
public class SceActivity extends AppCompatActivity {
    private List<TabFragment> mList;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_layout);
        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        mTabLayout=(TabLayout)findViewById(R.id.table_layout2);
        mList=new ArrayList<>();
        mList.add(new TabFragment(new FragmentOne(),"第一个界面"));
        mList.add(new TabFragment(new FragmentTwo(),"第二个界面"));
        mList.add(new TabFragment(new FragmentThree(),"第三个界面"));
        MyAdapter adapter=new MyAdapter(getSupportFragmentManager(),mList);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
