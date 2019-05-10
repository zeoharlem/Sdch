package com.orojinmi.theophilus.sdch;

import android.app.Application;

import com.orojinmi.theophilus.sdch.Utils.AidlUtil;

/**
 * Created by Administrator on 2017/4/27.
 */

public class BaseApp extends Application {
    private boolean isAidl;

    public boolean isAidl() {
        return isAidl;
    }

    public void setAidl(boolean aidl) {
        isAidl = aidl;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        isAidl = true;
        AidlUtil.getInstance().connectPrinterService(this);
    }
}
