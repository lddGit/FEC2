package com.ldd.fec;

import android.app.Application;

import com.ldd.latte.app.Latte;

/**
 * Created by 14522 on 2020/3/30.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();

    }
}
