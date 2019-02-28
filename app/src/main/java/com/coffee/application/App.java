package com.coffee.application;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Mcoffee on 2019/2/28.
 * Company: mingbo
 * Email: mkfcoffee@163.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
