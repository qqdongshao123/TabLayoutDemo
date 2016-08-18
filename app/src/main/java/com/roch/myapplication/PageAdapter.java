package com.roch.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/8/18.
 */
public class PageAdapter extends FragmentPagerAdapter {

    public final int COUNT = 3;
    private String[] titles = {"首页", "发现", "我的"};

    private Context mContext;

    public PageAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        return HomeFragmet.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    public View getTabView(int position) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.custom_page, null);
        TextView tv = (TextView) v.findViewById(R.id.news_title);
        tv.setText(titles[position]);
        return v;

    }
}
