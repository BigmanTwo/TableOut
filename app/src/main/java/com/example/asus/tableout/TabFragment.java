package com.example.asus.tableout;

import android.support.v4.app.Fragment;

/**
 * Created by Asus on 2016/4/13.
 */
public class TabFragment {
    private Fragment fagment;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Fragment getFagment() {
        return fagment;
    }

    public void setFagment(Fragment fagment) {
        this.fagment = fagment;
    }

    public TabFragment(Fragment fagment, String str) {
        this.fagment = fagment;
        this.str = str;
    }
}
