package com.rex.demoworking;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rex.demoworking.databinding.FragmentPagerBinding;

/**
 * Created by yaucheukming on 16/9/2016.
 */

public class DemoPagerFragment extends Fragment {

    private FragmentPagerBinding mFragmentPagerBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentPagerBinding = DataBindingUtil.bind(inflater.inflate(R.layout.fragment_pager, container, false), new DemoDataBindingComponent());
        mFragmentPagerBinding.setPagerAdapter(new DemoViewPagerAdapter(getChildFragmentManager()));
        return mFragmentPagerBinding.getRoot();
    }

}
