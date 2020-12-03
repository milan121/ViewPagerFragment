package com.milanapp.viewpagerfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        MyFragment fragment = new MyFragment();
        Bundle bundle = new Bundle();
        i = i + 1;
        bundle.putString("MESSAGE", "Message From Page : " + i );
        fragment.setArguments(bundle);


        return fragment;
    }

    @Override
    public int getCount() {
        return 50;
    }
}