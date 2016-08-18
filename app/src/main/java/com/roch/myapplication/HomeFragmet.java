package com.roch.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/8/18.
 */
public class HomeFragmet extends Fragment {

    private static final String PAGE = "page";

    private int mPage;

    public static HomeFragmet newInstance(int page) {

        Bundle bundle = new Bundle();
        bundle.putInt(PAGE, page);
        HomeFragmet homeFragmet = new HomeFragmet();
        homeFragmet.setArguments(bundle);
        return homeFragmet;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("第"+mPage+"页");
        return view;
    }
}
