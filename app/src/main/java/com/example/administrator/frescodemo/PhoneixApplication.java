package com.example.administrator.frescodemo;

import android.app.Application;
import android.net.Uri;

import com.facebook.drawee.backends.pipeline.BuildConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import org.xutils.x;

/**
 * Created by Administrator on 2017/2/20.
 */
public class PhoneixApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //基本使用的初始化方法
        //Fresco.initialize(this);

        //渐进式JPEG图的初始化方法
        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(this)
                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
                .build();
        Fresco.initialize(this,config);

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }

}
