package com.rex.demoworking;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingComponent;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by yaucheukming on 16/9/2016.
 */

public class DemoDataBindingComponent implements DataBindingComponent {


    @BindingAdapter(value = {"android:pagerAdapter"}, requireAll = false)
    public static void setViewPager(ViewPager viewPager, FragmentPagerAdapter adapter) {
        viewPager.setAdapter(adapter);
    }


}
