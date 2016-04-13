package com.example.asus.tableout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Asus on 2016/4/13.
 */
public class MyAdapter extends FragmentStatePagerAdapter {
    private List<TabFragment> mList;
    public MyAdapter(FragmentManager fm, List<TabFragment> mList) {
        super(fm);
        this.mList = mList;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position).getFagment();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position).getStr();
    }
}
