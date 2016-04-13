package com.example.asus.tableout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Asus on 2016/4/13.
 */
public class FirstActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mTabLayout=(TabLayout)findViewById(R.id.table_layout);
        mTabLayout.addTab(mTabLayout.newTab().setText("标签1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("标签2"));
        mTabLayout.addTab(mTabLayout.newTab().setText("标签3"));
        mTabLayout.addTab(mTabLayout.newTab().setText("标签4"));

    }
}
