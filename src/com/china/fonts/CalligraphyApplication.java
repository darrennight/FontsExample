package com.china.fonts;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import android.app.Application;

/**
 * 
 *
 * 作者:杨雯方

 * 时间: 2014年6月13日  下午2:28:31

 * 描述:TODO
 */
public class CalligraphyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault("fonts/Roboto-ThinItalic.ttf", R.attr.fontPath);
    }
}
