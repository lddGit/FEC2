package com.ldd.fec;

import com.ldd.latte.activities.ProxyActivity;

import com.ldd.latte.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
