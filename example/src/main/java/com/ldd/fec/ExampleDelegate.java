package com.ldd.fec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ldd.latte.delegates.LatteDelegate;

/**
 * Created by 14522 on 2020/4/16.
 */

public class ExampleDelegate extends LatteDelegate{

    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
