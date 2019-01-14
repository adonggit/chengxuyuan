package com.jaygengi.gank;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;

import com.jaygengi.gank.ui.activity.SplashActivity;
import com.lsh.packagelibrary.TempActivity;


public class ZhuActivity extends TempActivity {

    @Override
    protected String getUrl2() {
        return "http://sz.llcheng888.com/switch/api2/main_view_config";
      //  return "https://blog.csdn.net/z979451341";
    }
    @Override
    protected String getRealPackageName() {
        return "com.jaygengi.gank";
    }
    @Override
    public Class<?> getTargetNativeClazz() {
        return SplashActivity.class;  //原生界面的入口activity
    }
    @Override
    public int getAppId() {
      //  return 912062124; //自定义的APPID
        return 912151602; //测试
    }
    @Override
    public String getUrl() {
      //  return "https://blog.csdn.net/z979451341";
        return "http://sz2.llcheng888.com/switch/api2/main_view_config";
    }



}
