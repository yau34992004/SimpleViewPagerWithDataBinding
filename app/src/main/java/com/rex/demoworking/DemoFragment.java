package com.rex.demoworking;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rex.demoworking.databinding.FragmentDemoBinding;

/**
 * Created by yaucheukming on 14/9/2016.
 */

public class DemoFragment extends Fragment {

    private FragmentDemoBinding mFragmentDemoBinding;

    private String mKey;

    public static DemoFragment newInstance(String key){
        DemoFragment demoFragment = new DemoFragment();
        Bundle bundle = new Bundle();
        bundle.putString("DemoFragment",key);
        demoFragment.setArguments(bundle);
        return demoFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle == null){
            return;
        }

        mKey = bundle.getString("DemoFragment");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mFragmentDemoBinding = DataBindingUtil.bind(inflater.inflate(R.layout.fragment_demo, container, false));
        DemoItem demoItem = new DemoItem();
        demoItem.text = mKey;
        mFragmentDemoBinding.setItem(demoItem);

        return mFragmentDemoBinding.getRoot();
    }
}
